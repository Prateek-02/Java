import java.util.*;

/*
public class strings {
    public static void main(String[] args){
        // String declaration
        String name = "Tony";
        String fullname = "Tony Stark";
        String sentence = "My name is Tony Stark";
        System.out.println(name);
        System.out.println(fullname);
        System.out.println(sentence);

        // Input String
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("Your name is: "+a);
    }
}
*/


// Concatenation
/*
public class strings {

    public static void main(String[] args) {
        String fname = "Tony";
        String lname = "Stark";
        String fullname = fname+" "+lname;
        System.out.println(fullname);
        System.out.println(fullname.length());

        // charAt
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
    }
}
*/


// Comparision and substring

/*
public class strings {

    public static void main(String[] args) {
        String name1 = "Tony";
        String name2 = "Tony2";
        String sentence = "My name is Tony";
        String sentence2 = "TonyStark";

        //1 s1 > s2 : +ve value
        //2 s1 == s2 : 0(equal)
        //3 s1 < s2 : -ve value

        
        // if(name1.compareTo(name2)==0){
        //     System.out.println("String are equal");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }
        

        String name = sentence.substring(11,sentence.length());
        String name3 = sentence2.substring(0,5);
        System.out.println(name);
        System.out.println(name3);

        // Strings are immutable
    }
}
*/


// ParseInt Method of Integer class

/*
public class strings {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);
    }
}
*/


// ToString Method of String class

/*
public class strings {
    public static void main(String[] args) {
        int num = 123;
        String str = Integer.toString(num);
        System.out.println(str.length());
    }
}
*/


/* HW questions */
    
// 1(Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.)

/*
public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        String arr[] = new String[size];
        int total = 0;

        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.next();
            total+= arr[i].length();
        }
        System.out.println(total);
    }
}
*/


// 2 (Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.)

/*
public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String result = "";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                result += 'i';
            }
            else{
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
*/


// 3(Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.)

/*
public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String res = "";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='@'){
                break;
            }
            else{
                res += str.charAt(i);
            }
        }

        System.out.println(res);
    }
}
*/



/* String Builder */

/*
public class strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        // Insert at index
        sb.insert(0, 'S');
        System.out.println(sb);

        // Delete
        sb.delete(1, 2);
        System.out.println(sb);

        // Print Toy from Sony
        sb.setCharAt(0, 'T');
        sb.delete(2, 3);
        System.out.println(sb);

        // Append charactcer at end
        sb.append('s');
        System.out.println(sb);

        // Length of string
        System.out.println(sb.length());
    }
}
*/



// Reverse string

public class strings {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Prateek");
        // sb.reverse();

        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length() - 1 -i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
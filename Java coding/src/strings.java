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


// Comparision

public class strings {

    public static void main(String[] args) {
        String name1 = "Tony";
        String name2 = "Tony2";
        String sentence = "My name is Tony";
        String sentence2 = "TonyStark";

        //1 s1 > s2 : +ve value
        //2 s1 == s2 : 0(equal)
        //3 s1 < s2 : -ve value

        /* 
        if(name1.compareTo(name2)==0){
            System.out.println("String are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        */

        String name = sentence.substring(11,sentence.length());
        String name3 = sentence2.substring(0,5);
        System.out.println(name);
        System.out.println(name3);
    }
}
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
import java.util.*;

/* 
public class L1 {
    public static void main(String[] args) {
        System.out.println("Hello world with java");
        System.out.print("Hello world with java\nfrom apni kaksha");
    }
}
*/

/* 
public class L1 {

    public static void main(String[] args) {
        System.out.println("*\n**\n***\n****");
    }
}
*/


/*Variables in java */

/* 
public class L1 {

    public static void main(String[] args){
        
        int a = 8;
        int b = 6;

        int sum = a+b;
        int diff = a-b;
        int mul = a*b;
        int div = a/b;
        int rem = a%b;


        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);
    }
}
*/

/*Taking input */

public class L1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // String name = sc.next();     // To take input of single word
        String name1 = sc.nextLine();   // To take input of whole line

        int a = sc.nextInt();
        float b = sc.nextFloat();
        

        // System.out.println(name);
        System.out.println(name1);
        System.out.println(a);
        System.out.println(b);
    }
}
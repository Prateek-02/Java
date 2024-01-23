import java.util.*;

// 1(Print name)

/*
public class functions {

    public static void printMyName(String name){
        System.out.println("My name is " + name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyName(name);
    }
}
*/


// 2 (Add two numbers)

/*
public class functions {

    public static int addNum(int a,int b){
        int sum = a+b;
        return sum ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = addNum(a, b);
        System.out.println("Sum of a and b is: " + sum);
    }
}
*/


// 3 (Multiply two numbers)

/*
public class functions {

    public static int mulNum(int a,int b){
        int prod = a*b;
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int prod = mulNum(a, b);
        System.out.println("Product of a and b is: " + prod);
    }
}
*/


// 4 (Find the factorial of a number)

public class functions {

    public static void fact(int n){
        //loop
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int fact = 1;
        for(int i=n;i>=1;i--){
            fact*=i;
        }
        System.out.println(fact);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
    }
}
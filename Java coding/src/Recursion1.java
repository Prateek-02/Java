// import java.util.Scanner;

// 1 (Print 5 to 1)
/*
public class Recursion1 {
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        printNum(n);

        sc.close();
    }
}
*/


// 2 (Print 1 to 5)
/*
public class Recursion1 {
    public static void printNum(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        printNum(n);

        sc.close();
    }
}
*/


// 3 (Print Sum of n Natural numbers)

/*
public class Recursion1 {

    public static void printSum(int i,int n,int sum){
        if(i==n){
            sum +=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1, n, sum);
        System.out.println(i);
    }
    public static void main(String[] args) {
        printSum(1,5,0);
    }
}
*/


// 4 (Print Factorial of a number)

/*
public class Recursion1 {
    public static int printFact(int n){
        if(n==0 || n==1){
           return 1; 
        }
        int x = printFact(n-1);
        int fact = n*x;
        return fact;
    }
    public static void main(String[] args) {
       int n = 5;
       int ans = printFact(n);
       System.out.println(ans);
    }
}
*/


// 5 (Print the fibonacci series till nth term)

/*
public class Recursion1 {
    public static void printFibo(int a,int b,int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        printFibo(b, c, n-1);

    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        int n = 7;
        printFibo(a, b, n-2);
    }
    
}
*/


// 6 (Print x^n, where Stack height = n)

/*
public class Recursion1 {
    public static int printPower(int x,int n){
        if(n==0){
            return 1;
        } 
        if(x==0){
            return 0;
        } 
        int xPownm1 = printPower(x, n-1);
        int xPown = x*xPownm1;
        return xPown;  
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 6;
        int ans = printPower(x, n);
        System.out.println(ans);

    }
}
*/


// 7 (Print x^n, where Stack Height = logn)


public class Recursion1 {
    public static int printPower(int x,int n){
        if(n==0){
            return 1;
        } 
        if(x==0){
            return 0;
        } 

        // if n is even
        if(n%2==0){
           return printPower(x, n/2) * printPower(x, n/2);
        }  
        else{  // n is odd
            return printPower(x, n/2) * printPower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 7;
        int ans = printPower(x, n);
        System.out.println(ans);

    }
}
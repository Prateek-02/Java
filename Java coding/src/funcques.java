import java.util.*;

// 1(Print the avg of three numbers)

/*
public class funcques {

    public static void avg(int a,int b,int c){
        int sum = a+b+c;
        int avg = sum/3;
        System.out.println("Avg of numbers: " +avg);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        avg(a,b,c);
    }
}
*/


// 2(Print the sum of all odd numbers from 1 to n)

/*
public class funcques {

    public static void odd(int n){
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        return;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        odd(n);
    }
}
*/


// 3(Take two numbers and return the greatest)

/*
public class funcques {

    public static int greatest(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = greatest(a, b);
        System.out.println(res + " is greater");
    }
}
*/


// 4 (Take radius as input and return the cicumference of circle)

/*
public class funcques {

    public static double circumference(float r){
        double circumference = 2*(3.14)*r;
        return circumference;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextInt();

        double res = circumference(r);
        System.out.println("Circumference is "+res);
    }
}
*/


// 5 (Takes age as an input and returns if that person is eligible to vote)

/*
public class funcques {

    public static boolean vote(int age){
        if(age>18){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        boolean res = vote(age);
        System.out.println(res);
    }
}
*/


// 6 (Write a java program to enter the numbers till the user wants and at the end it should display the count of positive,negative and zeros entered)

/*
public class funcques {

    public static void CountNum(int n,int counts[]){
        if(n>0){
            counts[0]++;
        }
        else if(n<0){
            counts[1]++;
        }
        else{
            counts[2]++;
        }
    }

    public static void Display(int[] counts){
        System.out.println("Count of positive nums: " + counts[0]);
        System.out.println("Count of negative nums: " + counts[1]);
        System.out.println("Count of zeros: " + counts[2]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] counts = {0,0,0};
        char choice;

        do{
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            CountNum(n,counts);
            System.out.print("Do you want to enter a number(y/n): ");

            choice = sc.next().charAt(0);
        }
        while(choice =='y' || choice =='Y');

        Display(counts);
    }
}
*/


// 7 (Find the value of one number raised to the power of another)

/*
public class funcques {

    public static void NumPower(int x,int n){
        int power = 1;
        for(int i=0;i<n;i++){
            power *= x;
        } 
        System.out.println(x+ " raised to the power "+ n + " is: " + power);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of base: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of Exponent: ");
        int n = sc.nextInt();

        NumPower(x,n);
    }
}
*/


// 8 (Print fibonacci series)

public class funcques {

    public static void fibo(int n){
        int a = 0;
        int b = 1;
        for(int i=1;i<=n;i++){
            System.out.print(a+ " ");

            int next = a+b;
            a=b;
            b=next;
        }
        
    }

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo(n);
    }
}
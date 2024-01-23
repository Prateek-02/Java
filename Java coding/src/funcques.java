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
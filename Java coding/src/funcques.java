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


// 3(Take two numbers and finid the greatest)

public class funcques {

    public static void greatest(int a,int b){
        if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        greatest(a, b);
    }
}
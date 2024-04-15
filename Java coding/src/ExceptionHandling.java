// 1
/*
public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 8000;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("The result is: "+c);
        }
        catch(Exception e){
            System.out.println("Error: Failed to divide by 0");
            System.out.println(e.getMessage());
        }
    }
}
*/


// 2
/*

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] marks = {45,67,79,70,50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index: ");
        int ind = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int div = sc.nextInt();
        sc.close();

        try{
            System.out.println("The value at array index entered is: "+marks[ind]);
            System.out.println("The value after dividing:  "+marks[ind]/div);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
*/


// 3

/*
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] marks = {45,67,79,70,50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index: ");
        int ind = sc.nextInt();
        sc.close();
        try{
            System.out.println("Welcome to nested try");
            try{
                System.out.println(marks[ind]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index not present");
                System.out.println("Exception in level 2");
            }
        }
        catch(Exception e){
            System.out.println("Exception in level 1");
        }
    }
}
*/


// 4

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] marks = {45,67,79,70,50};
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.print("Enter the index: ");
            int ind = sc.nextInt();
            try{
                System.out.println("Welcome to nested try");
                try{
                    System.out.println(marks[ind]);
                    flag = false;
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Index not present");
                    System.out.println("Exception in level 2");
                }
            }
            catch(Exception e){
                System.out.println("Exception in level 1");
            }
        }
    }
}
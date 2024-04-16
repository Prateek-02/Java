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


// 3(Nested try)

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
/*
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
        sc.close();
    }
}
*/

// 5(Exception class)

/*
import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "I am a toString()";
    }

    public String getMessage(){
        return "I am a getMessage()";
    }
}
class MaxAgeException extends Exception{
    public String toString(){
        return "Age cannot br greater than 125";
    }

    @Override
    public String getMessage(){
        return "Make sure that the value of age entered is correct";
    }
}
public class ExceptionHandling {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<99){
            sc.close();
            try{
                // throw new MyException();
                throw new ArithmeticException("This is an Exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
    }
}
*/

// 6 (Throw Vs Throws)

/*
class NegRadiusException extends Exception{
    public String toString(){
        return "Radius cannot be negative";
    }

    public String getMessage(){
        return "Radius cannot be negative";
    }
}

public class ExceptionHandling {
    public static double area(int r) throws NegRadiusException{
        if(r<0){
            throw new NegRadiusException();
        }
        double res = Math.PI*r*r;
        return res;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        int res = a/b;
        return res;
    }
    public static void main(String[] args) {
        try{
            // int c = divide(6,0);
            // System.out.println(c);
            double d = area(9);
            System.out.println(d);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        
    } 
}
*/


// 7(Finally)

public class ExceptionHandling {
    public static int greet(){
        try{
            int a = 50;
            int b = 0;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("This is the end of the function");
        }
        return -1;
    }
    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        int a = 7;
        int b = 9;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally");
            }
            b--;
        }
    }
}
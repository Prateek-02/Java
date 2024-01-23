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

public class functions {

    public static void addNum(int a,int b){
        System.out.println(a+b);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        addNum(a, b);

    }
}

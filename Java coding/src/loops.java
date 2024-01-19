import java.util.*;

/* For loop */

/*
public class loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");     // To print in the new line
        // System.out.print("Enter the value of n: ");     // To print in the same line
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){                         // if we not give the terminatig condition the loop will run infinitely
            // System.out.println("Hello World!");
            System.out.println(i+" ");
            // System.out.print(i+" ");
        }
    }
}
*/


/* While loop */

/*
public class loops{
    public static void main(String args[]){
        int n = 0;
        while(n<=10){
            System.out.println(n);
            n++;
        }   

    }
}
*/


/* Do while loop */

/*
public class loops{
    public static void main(String args[]){
        int i=0;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=10);
    }
}
*/


/* Questions */

// 1> Print the sum of n natural numbers

public class loops{
    public static void main(String[] args) {
        int n=4;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}

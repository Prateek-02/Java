import java.util.*;

public class loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){                         // if we not give the terminatig condition the loop will run infinitely
            // System.out.println("Hello World!");
            System.out.println(i);
        }
    }
}

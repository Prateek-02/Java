import java.util.*;
import java.io.*;

/*L1*/

/*  public class Online {
//     public static void main(String[] args) {
//         System.out.println(1+2);
//     }
 }*/


//2

//  public class Online {
 
//     public static void main(String[] args) {
//         int ex1 = 1+4+6;
//         int ex2 = 3+8+4;

//         System.out.println(ex1+ex2);

//     }
//  }

/* ARRAY */

/**
 * Online
 */
public class Online {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3};
        int n = arr.length;
        System.out.println("Length of thr array is: " + n);
        System.out.print("Elements of array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int arr2[] = new int[5];
        System.out.print("Enter the elements of arr2: ");
        for(int i=0;i<arr2.length;i++){
            arr2[i] = sc.nextInt();
        }

        System.out.print("Elements in arr2: ");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}










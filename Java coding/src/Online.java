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

/*
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
*/


// 2D array

/*
public class Online {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
*/

// Rotate array by given index

/*
public class Online {
    public static void main(String[] args){
        int d = 3;
        int arr[] = {1,4,5,6,7,9,2};
        int n = arr.length;

        int temp[] = new int[d];

        //store in temp array first
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }

        for(int i=n-d-1;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<d;i++){
            System.out.print(temp[i]+" ");
        }
        
    }
}
*/

// Print all the substrings of even length

/*
public class Online {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int len = n.length();
        for(int i=0;i<=len;i++){
            for(int j=i;j<=len;j++){
                if((j-i)%2==0){
                    System.out.println(n.substring(i,j)+" ");
                }
            }
        }
    }
}
*/


//String Builder

@SuppressWarnings("unused")
public class Online {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ABCD");
        //append
        sb.append("abc");
        System.out.println("Content is: "+sb);

        StringBuilder sb2 = new StringBuilder(10);
        System.out.println(sb2.capacity());
        
        //accessing char at index
        System.out.println(sb.charAt(0));

        //delete in range
        sb.delete(2, 4);
        System.out.println(sb);

        //delete particular index
        sb.deleteCharAt(0);
        System.out.println(sb);

        //replace char at particular index
        sb.setCharAt(3, 'E');
        System.out.println(sb);

        //reverse string
        sb.reverse();
        System.out.println(sb);

        //replace the string to a range
        sb.replace(0, 4, "Good");
        System.out.println(sb);
    }
}








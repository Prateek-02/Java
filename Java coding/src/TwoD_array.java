import java.util.*;

/*
public class TwoD_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        System.out.println("Elements in array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
*/


// 1 (Take a matrix as input from the user.Search for a given number x and print the indices at which it occurs.)

public class TwoD_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the no. of cols: ");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        System.out.println("Enter the elements of array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]==target){
                    System.out.print(target + " found at location (" + i+ ","+j + ")");
                }
            }
        }

    }
}

    

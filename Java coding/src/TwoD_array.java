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

/*
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
*/


/* HW Ques */
    
// 1(Print the spiral order matrix)

/*
public class TwoD_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the no. of cols: "); 
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
            matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral order matrix: ");

        int row_s = 0;
        int row_e = rows-1;
        int col_s = 0;
        int col_e = cols-1;

        while(row_s <= row_e && col_s <= col_e){
            for(int col=col_s; col<=col_e; col++) {
                System.out.print(matrix[row_s][col] + " ");
            }
            row_s++;

            for(int row=row_s; row<=row_e; row++) {
                System.out.print(matrix[row][col_e] +" ");
            }
            col_e--;

            for(int col=col_e; col>=col_s; col--) {
                System.out.print(matrix[row_e][col] + " ");
            }
            row_e--;

            for(int row=row_e; row>=row_s; row--) {
                System.out.print(matrix[row][col_s] + " ");
            }
            col_s++;

            System.out.println();
  
        }
    }
}
*/


// 2(For a given matrix of N x M, print its transpose.)

/*
public class TwoD_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the no. of cols: ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
        System.out.println("Enter the elements of array: ");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose of matrix: ");

        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
*/


// 3(Print diagonal elements of the matrix)

/*
public class TwoD_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter no. of cols: ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Diagonal elements are: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }  
    }
}
*/


// 4(Print anti diagonal elements of the matrix)

/*
public class TwoD_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter no. of cols: ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Anti diagonal elements are: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i+j==n-1){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}            
*/


// 5(Exchange of columns)

public class TwoD_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter no. of cols: ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        
    }
} 
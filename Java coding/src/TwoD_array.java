import java.util.*;

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

    

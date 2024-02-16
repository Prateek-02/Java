import java.util.*;

// 1) Bubble sort (Time complexity = O(n^2))

/*
public class Sorting {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++)
            if(arr[j]>arr[j+1]){
                //swap  
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        System.out.print("Sorted array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
   } 
}
*/


// 2) Selection Sort

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<size-1;i++){
            int smallest=i;
            for(int j=i+1;j<size;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.print("Sorted array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
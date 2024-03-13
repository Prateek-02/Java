import java.util.*;

// 1) Bubble Sort (Time Complexity = O(n^2))

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


// 2) Selection Sort  (Time Complexity = O(n^2))

/*
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
            //swap
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
*/


// 3) Insertion Sort (Time Complexity = O(n^2 ))

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1;i<size;i++){
            int current = arr[i];
            int j =i-1;
            while(j >=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j+1] = current;
        }

        System.out.print("Sorted array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}
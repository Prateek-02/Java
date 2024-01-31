import java.util.Scanner;

/*
public class arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements of array: ");

        //input
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        //output
        System.out.print("Elements in array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
*/


// Take an array as an input.Search for agiven number x and print the index at which it occurs

public class arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        //input
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        for(int i=0;i<size;i++){
            if(arr[i]==target){
                System.out.println("Target found at index "+ i);
                break;
            }
        }
    }
}
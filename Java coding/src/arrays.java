import java.util.*;

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

/*
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
*/

/* Homework Questions */

// 1(Take an array of names as input from the user and print them on the screen.)

/*
public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        String names[] = new String[size];

        System.out.print("Enter the elements: ");
        for(int i=0;i<size;i++){
            names[i]=sc.next();
        }

        System.out.print("Elements in array: ");
        for(int i=0;i<size;i++){
            System.out.print(names[i]+" ");
        }
    }   
}
*/


// 2(Find the maximum & minimum number in an array of integers.)

/*
public class arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter the elements of array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min=arr[i];
            }

            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);
    }
}
*/


// 3(Take an array of numbers as input and check if it is an array sorted in ascending order.)

/*
public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int nums[] = new int[size];

        System.out.print("Enter the elements of array: ");
        for(int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }

        System.out.print("Elements in the array: ");
        for(int i=0;i<size;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();

        boolean isAscending = true;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                isAscending=false;
            }
        }

        if(isAscending){
            System.out.println("The array is sorted in asending order");
        }
        else{
            System.out.println("The array is not sorted in ascending order");
        }
    } 
}
*/


// 4 (Reverse the array)

public class arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int start = 0;
        int end = size-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.print("Reversed array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
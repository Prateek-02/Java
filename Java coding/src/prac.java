import java.util.Scanner;

public class prac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        boolean found = false;

        for(int i:arr){
            if(i<25){
                System.out.println(i);
                found = true;
            }
        }

        if(!found){
            System.out.println("Not found");
        }
    }
}

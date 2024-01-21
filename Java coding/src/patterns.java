import java.util.*;

// 1 (Solid rectangle)

/*
public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/


// 2 (Hollow rectangle)

/*
public class patterns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Outer loop
        for(int i=1;i<=n;i++){
            //Inner loop
            for(int j=1;j<=n+1;j++){
                //cell ->(i,j)
                if(i==1 || j==1 || i==n || j==n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
*/


// 3 (Half pyramid)

public class patterns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



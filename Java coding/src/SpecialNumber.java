import java.util.Scanner;

// 1
/*
public class SpecialNumber{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isSpecialNumber(number)) {
            System.out.println(number + " is a special number.");
        } else {
            System.out.println(number + " is not a special number.");
        }

        scanner.close();
    }

    public static boolean isSpecialNumber(int number) {
        return sumOfDigitsRaisedToPositions(number) == number;
    }

    public static int sumOfDigitsRaisedToPositions(int number) {
        String numberStr = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            sum += Math.pow(digit, i + 1);
        }
        return sum;
    }
}
*/

// 2

public class SpecialNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(n!=0){
            int d = n%10;
            int fact = 1;
            for(int i=1;i<=d;i++){
                fact*=i;
            }
            sum+=fact;
            temp = temp/10;
        }
        System.out.println("Sum of factorial of digits: "+sum);
        if(sum==n){
            System.out.println("It is a special number");
        }
        else{
            System.out.println("It is not a special number");
        }
        sc.close();
    }
}

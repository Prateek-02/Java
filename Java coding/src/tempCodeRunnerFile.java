

// 5(Exception class)

/*
import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "I am a toString()";
    }

    public String getMessage(){
        return "I am a getMessage()";
    }
}
class MaxAgeException extends Exception{
    public String toString(){
        return "Age cannot br greater than 125";
    }

    @Override
    public String getMessage(){
        return "Make sure that the value of age entered is correct";
    }
}
public class ExceptionHandling {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<99){
            sc.close();
            try{
                // throw new MyException();
                throw new ArithmeticException("This is an Exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
    }
}
*/

// 6 (Throw Vs Throws)

class NegRadiusException extends Exception{
    public String toString(){
        return "Radius cannot be negative";
    }

    public String getMessage(){
        return "Radius cannot be negative";
    }
}


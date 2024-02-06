import java.util.*;

// 1) Get Bit

/*
public class bit_manip {
    public static void main(String[] args) {
        int n = 5;  // 0101
        int pos = 2;
        int bitMask = 1<<pos;

        if((bitMask & n) == 0){      // And operation is used to get the bit
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
    }
}
*/

// 2) Set Bit  (OR operation is used to set the bit)

public class bit_manip {
    public static void main(String[] args) {
       int n = 5;  //0101
       int pos = 1;
       int bitMask = 1<<pos;

       int newNum = bitMask | n;
       System.out.println(newNum);
    }
}


// 3) Clear bit
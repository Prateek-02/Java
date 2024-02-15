import java.util.*;

// 1) Get Bit

/*
public class bit_manip {
    public static void main(String[] args) {
        int n = 5;  // 0101
        int pos = 2;
        int bitMask = 1<<pos;    (1*2^2=4 == 0100)

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
       int bitMask = 1<<pos;   //(1*2^1 = 2 = 0010)

       int newNum = bitMask | n;  //( 0101 | 0010 )
       System.out.println(newNum);  //(0111 = 7)
    }
}


// 3) Clear bit
import java.util.*;
@SuppressWarnings("unused")


/* CLASS AND OBJECTS */

public class Online2 {
    //attributes(instance properties)
    int a =5;
    int b =6;

    public void setX(int x){
        this.a=x;
        System.out.println((a));
    }

    public int getX(){
        return this.a;
    }
    public static void main(String[] args){
        Online2 obj = new Online2();
        int x = obj.a;
        int y = obj.b;
        int z = x+y;
        System.out.println("Sum of x+y: "+z);

        x += 5; 
        y += 5;
        z = x+y;
        System.out.println("Sum of x+y: "+z);

        Online2 obj2 = new Online2();
        obj2.setX(2);

        System.out.println(obj2.getX());
    }


}

import java.util.*;
@SuppressWarnings("unused")


/* CLASS AND OBJECTS */

public class Online2 {
    //attributes(instance properties)
    int x =5;
    int y =6;

    // Default constructor
    Online2(){
        this.x = 8;
        this.y = 10;
        System.out.println("Object Created");
    }
    //Parameterized constructor
    Online2(int x,int y){
        this.x=x;
        this.y=y;

        System.out.println("Object created with data points "+ this.x + " and " + this.y);
    }

    public void setX(int x){
        this.x=x;
        System.out.println((x));
    }

    public int getX(){
        return this.x;
    }
    public static void main(String[] args){
        Online2 obj = new Online2(10,20);
        int x = obj.x;
        int y = obj.y;
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

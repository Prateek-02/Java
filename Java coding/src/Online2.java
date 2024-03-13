/* CLASS AND OBJECTS */

/*
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
*/


// Inheritance

/*
class A{
    public int a;
    public void show(){
        System.out.println("Inside class A "+this.a);
    }
    public void show(int n1,int n2){
        System.out.println("The numbers are: "+n1+" and "+n2);
    }
    public void show(float n3,float n4){
        System.out.println("The numbers are: "+n3+" and "+n4);
    }
}

class B extends A{
    public void show(){
        System.out.println("Inside class B "+this.a);
    }

    public void show1(){
        System.out.println("Inside class B "+this.a);
    }
}


public class Online2 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();
        obj1.show(1,2);
        obj1.show(1.5f,2.7f);

        B obj2 = new B();
        obj2.show();
        obj2.show1();
    }   
}
*/

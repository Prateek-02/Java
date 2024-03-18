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

// Abstract Class

/*
abstract class A{
    int a =0;

    abstract public void show();

    public void setA(int a){
        this.a=a;
    }
}
*/

/*
interface in1{
    //static,public,final
    int i1=10;

    //by default public and abstract
    void show1();
}
interface in2{
    void show2();
}
class test implements in1,in2{
    int t1=5;
    int t2=6;
    public void show1(){
        System.out.println("Value of t is: "+t1);
    }
    public void show2(){
        System.out.println("Value of t is: "+t2);
    }
    
}
public class Online2 {
    public static void main(String[] args) {
        test obj = new test();
        obj.show1();
        obj.show2();
    }
}
*/

// Write a Java program to create an interface Shape with the getArea() method. 
//Create three classes Rectangle,Triangle and Circle that implement the Shape interface.
//Implement the getArea() method for each of the three classes.

/*
interface Shape {
    void getArea();
}

class Rectangle implements Shape {
    int l = 10;
    int b = 10;

    public void getArea() {
        double Area = l * b;
        System.out.println("Area of Rectangle is: " + Area);
    }
}

class Triangle implements Shape {
    int h = 5;
    int b = 10;

    public void getArea() {
        double Area = (1.0 / 2) * b * h;
        System.out.println("Area of Triangle is: " + Area);
    }
}

class Circle implements Shape {
    int r = 9;

    public void getArea() {
        double Area = Math.PI * r * r;
        System.out.println("Area of Circle is: " + Area);
    }
}

public class Online2 {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        Triangle obj2 = new Triangle();
        Circle obj3 = new Circle();

        obj1.getArea();
        obj2.getArea();
        obj3.getArea();
    }
}
*/


interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Triangle implements Drawable {

    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Online2 {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        Triangle obj2 = new Triangle();
        Circle obj3 = new Circle();

        obj1.draw();
        obj2.draw();
        obj3.draw();
    }
}
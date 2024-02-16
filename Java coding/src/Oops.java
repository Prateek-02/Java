import java.util.*;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }

    public void printType(){
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int age;
    int id;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.id);
    }

    Student(){
        System.out.println("Constructor called");
    }

}

public class Oops {
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ballpoint";

        pen1.printColor();
        pen2.printColor();

        pen1.printType();
        pen2.printType();


        Student s1 = new Student();
        s1.name = "Prateek";
        s1.age = 20;
        s1.id = 122;
        Student s2 = new Student();
        s2.name = "Sumit";
        s2.age = 20;
        s2.id = 123;

        s1.printInfo();
        s2.printInfo();

    }
}

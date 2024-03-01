import java.util.*;

class Pen{
    String color;
    String type;    // ball or gel

    public void write(){
        System.out.println("Writing something");
    }

    public void printpenInfo(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(){          //non-parameterized constructor
        System.out.println("Constructor called");
    }

    // Student(String name,int age){      // Parameterized constructor
    //     this.name=name;
    //     this.age=age;
    // }

    Student(Student s2){                // copy cosntructor
        this.name = s2.name;
        this.age=  s2.age;
    }
}

public class Oops{
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        Pen pen2  = new Pen();
        pen2.color = "Black";
        pen2.type = "Ball";

        pen1.printpenInfo();
        pen2.printpenInfo();

        Student s1 = new Student();
        s1.name = "Prateek";
        s1.age = 20;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
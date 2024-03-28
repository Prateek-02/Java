/*
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

    public void printInfo(String name){         // polymorphism(Same function name but different functionality)
        System.out.println(name);
    }
    public void printInfo(int age){             // polymorphism
        System.out.println(age);
    }
    public void printInfo(String name,int age){   // polymorphism
        System.out.println(name+" "+age);
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

        s1.printInfo("Anish");
        s1.printInfo(19);
        s1.printInfo("Anish",19);
    }
}
*/


/* INHERTANCE (one class inherit the property of another class) */

/*
class Shape{         // Parent class
    int l,h;
    public void area(){
        System.out.println("diaplays area");
    }
}

class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println((1.0/2)*l*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}


public class Oops {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area();
        s.l = 5;
        s.h = 5;
        Triangle t1 = new Triangle();
        t1.area(s.l,s.h);

        Circle c1 = new Circle();
        c1.area(5);

        
    }
}
*/


// Abstraction

/*
abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("Inside animal constructor");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Inside horse constructor");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Oops {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();

    }
}
*/


// Pure Abstraction(Using Interface)

/*
interface Animal {
    int eyes = 2;
    void walk();
}

interface Herbivore{
    void eat();
}

class Horse implements Animal,Herbivore{
    Horse(){
        System.out.println("Inside horse constructor");
    }
    public void eat(){
        System.out.println("Horse eats grass");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
        System.out.println("Horse has "+eyes+" eyes");
    }
}

class Chicken implements Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
        System.out.println("Chicken has "+eyes+" eyes");
    }
}

public class Oops {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();

        Chicken chicken = new Chicken();
        chicken.walk();
    }
}
*/


// Static

class Student{
    String name;
    static String school;    // it is common for everyone

    public static void changeSchool(){
        school = "newschool";
    }
}

public class Oops {
    public static void main(String[] args) {
       Student.school  = "DAV";
       Student student1 = new Student();
       student1.name = "Tony";

       System.out.println(student1.name);
       System.out.println(student1.school);
    }
}
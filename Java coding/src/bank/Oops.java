package bank;

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

class EquiTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println((1.0/2)*l*h);
    }
}

public class Oops {
    public static void main(String[] args) {
        // Shape s = new Shape();
        // s.area();
        // s.l = 5;
        // s.h = 5;
        // Triangle t1 = new Triangle();
        // t1.area(s.l,s.h);

        bank.Account account1 = new bank.Account();
        account1.name = "customer1";

       

        
    }
}
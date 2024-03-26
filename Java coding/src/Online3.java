//1

/*
interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

interface C {
    void methodC();
}

class Test implements B, C {
    
    public void methodA() {
        System.out.println("Inside methodA");
    }

    public void methodB() {
        System.out.println("Inside methodB");
    }

    public void methodC() {
        System.out.println("Inside methodC");
    }
}

public class Online3 {
    public static void main(String[] args) {
        Test test = new Test();

        test.methodA();
        test.methodB();
        test.methodC();
    }
}
*/


// 2

/*
interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

interface C extends B{
    void methodC();
}

class Test implements B{
    
    public void methodA() {
        System.out.println("Inside methodA");
    }

    public void methodB() {
        System.out.println("Inside methodB");
    }

    public void methodC() {
        System.out.println("Inside methodC");
    }
}

public class Online3 {
    public static void main(String[] args) {
        Test test = new Test();

        test.methodA();
        test.methodB();
        test.methodC();
    }
}
*/


// 3 
/*
interface in1{
    int i1=10;

    void show1();

    // Nested interface
    interface in2{
        int i2 = i1;
        void show2();
    }
}

class test implements in1{

    @Override
    public void show1(){
        System.out.println(i1);
    }

    //it is completely different method it is not overridden
    public void show2(){
        System.out.println("inside show2 method");
    }
}

public class Online3 {
    public static void main(String[] args) {
        test obj = new test();
        obj.show1();
        obj.show2();
    }
    
}
*/


// 4

/*
interface A{
    int a = 10;
    void show1();

    interface B{
        int b = a+1;
        void show2();
    }
}

interface C extends A{
    int c = 20;
    void show3();
}

class test implements C,C.B{
    @Override
    public void show1(){
        System.out.println(a);
    }

    @Override
    public void show2(){
        System.out.println(b);
    }

    @Override
    public void show3(){
        System.out.println(c);
    }
}

public class Online3 {
    public static void main(String[] args) {
        test obj = new test();

        obj.show1();
        obj.show2();
        obj.show3();
    }
}
*/


// 5

/*
class A{
    int a = 5;
    static int b = 6;
    void show1(){
        System.out.println(a);
    }

    class B{
        void show2(){
            System.out.println(b);
            show1();
        }
    }
}

public class Online3 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show1();

        A.B obj2 = obj1.new B();
        obj2.show2();
    }    
}
*/

// 6

/*
class A{
    int a = 5;
    static int b = 6;
    void show1(){
        System.out.println(a);
    }

    static class C{
        void show3(){
            System.out.println(b);
        }
    }
}

public class Online3 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show1();

        A.C obj2 = new A.C();
        obj2.show3();
    }    
}
*/

// 7

/*
class A{
    int a = 5;
    int b = 6;
    void show1(){
        System.out.println(a);
    }

    class B{
        void show2(){
            System.out.println(b);
        }
    }
}

class C extends A{
    void show3(){
        System.out.println("Inside show3");
    }
}

public class Online3 {
    public static void main(String[] args) {
        C obj1 = new C();
        obj1.show1();
        obj1.show3();

        C.B obj2 = obj1.new B();
        obj2.show2();
    }    
}
*/

// 8

interface Int {
    void myMethod();
}

class A {
    public void outerMethod() {
        System.out.println("Outer method of class A");
        
        if (true) {
            System.out.println("Inside if block of class A");
            
            class B implements Int {
                @Override
                public void myMethod() {
                    System.out.println("Implemented method in class B");
                }
            }
            
            B objB = new B();
            objB.myMethod();
        }
    }
}

public class Online3 {
    public static void main(String[] args) {
        A objA = new A();
        objA.outerMethod();
    }
}

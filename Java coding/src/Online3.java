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

interface A{
    void show1();

    interface B{
        void show2();
    }
}

interface C extends A{
    void show3();
}

class test implements C{
    public void show1(){
        System.out.println("Inside show1");
    }
    public void show2(){
        System.out.println("Inside show2");
    }
    public void show3(){
        System.out.println("Inside show3");
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
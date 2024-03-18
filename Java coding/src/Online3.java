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

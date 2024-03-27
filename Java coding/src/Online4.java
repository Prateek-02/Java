//1

/*
interface int1{
    //void show1();

    int show2(int num);
}
public class Online4 {
    public static void main(String[] args) {
        // lambda function
        
        // int1 ref = () -> System.out.println("Inside show method");
        // ref.show1();
        

        int1 ref2 = (int num) -> {
            return num;
        };
        System.out.println(ref2.show2(5));
    }
}
*/

// 2

interface int1{
    int show(int x,int y,int z);
}

public class Online4 {
    public static void main(String[] args) {
        int1 ref = (int a,int b,int c) -> {
            return a+b+c;
        };
        System.out.println("Sum is: "+ref.show(2, 3, 4));
    }
}



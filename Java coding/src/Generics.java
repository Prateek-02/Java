import java.util.ArrayList;

class myGeneric<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public myGeneric(int val, T1 t1, T2 t2){
        this.val =val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal(){
        return val;
    }

    public void setVal(int val){
        this.val=val;
    }

    public T1 getT1(){
        return t1;
    }

    public void setT1(T1 t1){
        this.t1=t1;
    }

    public T2 getT2(){
        return t2;
    }

    public void setT2(T2 t2){
        this.t2=t2;
    }
}


public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(54);
        al.add(643);

        al.remove(2);

        // int a =  al.get(0);
        for(int i: al){
            System.out.println(i);
        }
        // System.out.println(a);
        myGeneric<String, Integer> g1 = new myGeneric<>(23, "MyString",45);
        String x = g1.getT1();
        int z = g1.getT2();
        System.out.println(x);
        System.out.println(z);
        System.out.println(g1.getVal());
    }
}

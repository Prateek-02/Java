import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1
/*
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
*/


// 2

/*

class MarksHolder<T>{
    private List<T> elements;

    public MarksHolder(){
        this.elements = new ArrayList<>();
    }

    public void add(T element){
        elements.add(element);
    }

    public void delete(T element){
        elements.remove(element);
    }

    public List<T> getMarks(){
        return new ArrayList<>(elements);
    }
}
public class Generics {
    public static void main(String[] args) {
        MarksHolder<Integer> marks = new MarksHolder<>();

        marks.add(98);
        marks.add(90);
        marks.add(86);
        marks.add(95);

        marks.delete(86);

        List<Integer> elements = marks.getMarks();
        for(int element : elements){
            System.out.println(element);
        }

    }
}

*/


// 3  (Array Vs ArrayList)  -->  Arrays have a fixed size but ArrayList can grow and shrink

public class Generics {
    public static void main(String[] args) {
        // Create
        String[] friends = {"John","Chris","Eric","Luke"};
        ArrayList<String> fArrayList = new ArrayList<>(Arrays.asList("John","Chris","Eric","Luke")); 

        //Get element
        System.out.println(friends[0]);
        System.out.println(fArrayList.get(0));

        //Get size
        System.out.println(friends.length);
        System.out.println(fArrayList.size());

        //Add element
        fArrayList.add(4, "Mitch");
        System.out.println(fArrayList.get(4));

        //Set an element
        friends[0] = "Carl";
        System.out.println(friends[0]);

        fArrayList.set(0, "Carl");
        System.out.println(fArrayList.get(0));

        //remove a element
        fArrayList.remove(3);
        System.out.println(fArrayList);

    }
}

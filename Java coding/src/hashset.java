import java.util.*;
public class hashset {
    public static void main(String[] args) {
        // Creating
        HashSet<Integer> set = new HashSet<>();
        
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(4);

        //Search - contains
        if(set.contains(1)){
            System.out.println("set contains 1");
        }

        if(!set.contains(6)){
            System.out.println("does not contain");
        }

        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain 1, since we deleted 1");
        }

        //Size
        System.out.println("Size of set is: "+set.size());

        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();
        // hasNext, next
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

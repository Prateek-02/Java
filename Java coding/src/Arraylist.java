import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add elements
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Elements in list: "+list);

        // get element
        int element = list.get(1);
        System.out.println("Get element: "+element);

        // add element in between
        list.add(1,5);
        System.out.println(list);

        // set element(replace the index value)
        list.set(0,8);
        System.out.println(list);

        // delete element
        list.remove(4);
        System.out.println(list);

        // size of list (Prints the size of the list)
        int size = list.size();
        System.out.println("Size of list: "+size);

        // loops
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        // sorting

        Collections.sort(list);
        System.out.println("After sorting: "+list);
        
    }
}

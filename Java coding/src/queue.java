import java.util.*;

// Using collection framework

public class queue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        // queue.add(1);
        // queue.add(2);
        // queue.add(3);
        // queue.add(4);
        // queue.add(5);

        String input = sc.nextLine();

        String[] elements = input.split(" ");
        for(String x:elements){
            queue.add(Integer.parseInt(x));
        }

        // queue.remove(5);

        // while(!queue.isEmpty()){
        //     System.out.println(queue.peek());
        //     queue.remove();
        // }

        System.out.print(queue);

        // System.out.println(queue.poll());

        ArrayList<Integer> list = new ArrayList<>(queue);
        Collections.reverse(list);
        System.out.println(list);     
        
        sc.close();
    }
}
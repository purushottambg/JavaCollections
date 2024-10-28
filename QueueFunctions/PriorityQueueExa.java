import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExa {
    public static void main(String[] args) {
        Queue<Integer> pQueue = new PriorityQueue<>();
        Queue<Integer> rQueue = new PriorityQueue<>(Comparator.reverseOrder()); //This is used to set reverse priority
        pQueue.add(12);
        pQueue.add(27);
        pQueue.add(87);
        pQueue.add(41);

        System.out.println("Printing the PriorityQueue: "+pQueue);
        System.out.print("Adding 67 in Priority Queue and printig value: " );
        pQueue.add(67);
        System.out.println(pQueue);
        System.out.println("Removing smallest element: "+ pQueue.peek());

        rQueue.add(12);
        rQueue.add(27);
        rQueue.add(87);
        rQueue.add(41);
        System.out.println("Printing the PriorityQueue: "+rQueue);
        System.out.print("Adding 67 in Priority Queue and printig value: " );
        pQueue.add(67);
        System.out.println(pQueue);
        System.out.println("Removing smallest element: "+ pQueue.peek());
    }
}

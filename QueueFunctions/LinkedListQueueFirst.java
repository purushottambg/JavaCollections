import java.util.LinkedList;
import java.util.Queue;


public class LinkedListQueueFirst {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(12);
        queue.add(34);
        queue.add(46);
        System.out.println("First element in queue: "+queue.peek());
        System.out.println("Removed element is: "+ queue.poll());
        System.out.println("Current Queue: "+queue);
        queue.offer(42);
        System.out.println("Added 42 at: "+queue);
    }
}

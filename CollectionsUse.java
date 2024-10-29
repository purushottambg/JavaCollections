import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class CollectionsUse {
    public static void main(String[] args) {
        List<Integer> queue = new LinkedList<>();
        
        queue.add(24);
        queue.add(54);
        queue.add(56);
        queue.add(17);
        System.out.println("Before collections sort: " + queue);
        Collections.sort(queue);
        System.out.println("After collections sort: " + queue);
    }
}
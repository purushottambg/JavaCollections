import java.util.ArrayDeque;

public class ArrayDequeueexa {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();  //This is an array which accept the elements from both of the sides and also remove from bot of the side
        System.out.println("addinng first element: "); adq.addFirst(12);
        System.out.println(adq);
        System.out.println("addinng element by normal add : "+ adq.add(16));
        System.out.println(adq);
        System.out.println("addinng element by last add : "); adq.addLast(11);
        System.out.println(adq);
        adq.addFirst(12);
        adq.addLast(76);
        adq.addFirst(765);
        System.out.println("Added many results: "+adq);
        System.out.println("Removing random: "+adq.peek());
        System.out.println("adq.peek(): "+adq.peek());
        System.out.println("Removing first: "+adq.peekFirst());  //Retrives the first element
        System.out.println("adq.pollFirst(): "+adq.pollFirst());  //Poll is used for removal
        System.out.println("Removing Last: "+adq.pollLast());
        System.out.println("adq.peekLast(): "+adq.peekLast());
        System.out.println("Adding Lasst: 34"); adq.addLast(34);
        System.out.println("Adding using offer method Last: "+adq.offerLast(54));
        System.out.println("Adding first: 34"); adq.addFirst(34);
        System.out.println("Adding using offer method First: "+adq.offerFirst(54));
        
        System.out.println("Final Elements: "+adq);
    }
}

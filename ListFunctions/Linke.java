import java.util.LinkedList;

public class Linke{
    public static void main(String[] args) {       
        LinkedList<String> linkedList = new LinkedList<>();
 
        linkedList.add("Alice");
        linkedList.add("Bob");
        linkedList.add("Charlie");
        linkedList.addFirst("Zara"); // Add to the beginning
        linkedList.addLast("Eve");   // Add to the end

        // Display the LinkedList
        System.out.println("LinkedList after additions: " + linkedList);

        // Accessing elements
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

        // Removing elements
        linkedList.removeFirst();  // Removes "Zara"
        linkedList.removeLast();   // Removes "Eve"
        linkedList.remove("Bob");  // Removes "Bob" by value

        // Display the LinkedList after removals
        System.out.println("LinkedList after removals: " + linkedList);

        // Searching for an element
        boolean containsCharlie = linkedList.contains("Charlie");
        System.out.println("LinkedList contains 'Charlie': " + containsCharlie);

        // Get element at a specific index
        String secondElement = linkedList.get(1); // Index 1
        System.out.println("Element at index 1: " + secondElement);

        // Clear all elements
        linkedList.clear();
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}
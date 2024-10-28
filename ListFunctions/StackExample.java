import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> animalStack = new Stack<>();
        animalStack.add("Buffelo");
        animalStack.add("Cow");
        animalStack.push("Deer");
        Iterator<String> stackIterator = animalStack.iterator();
        while (stackIterator.hasNext()) {
            System.out.println("Printing one of the item using iterator: "+ stackIterator.next());            
        }
        System.out.println("Last added element in stack is: "+animalStack.peek());
        animalStack.pop();
        System.out.println("Removed top element in stack, current elements: "+ animalStack);
        System.out.println("now last added element in stack is: "+animalStack.peek());
        System.out.println(animalStack);
        animalStack.clear();
        System.out.println("printin after the clearing: "+ animalStack);
    }
}
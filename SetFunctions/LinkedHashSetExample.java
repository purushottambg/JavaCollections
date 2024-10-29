import java.util.LinkedHashSet;
import java.util.Set;

class LinkedHashSetExample {
    public static void main(String[] args) {
        Set <Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(23);
        linkedHashSet.add(67);
        linkedHashSet.add(57);
        linkedHashSet.add(43);
        linkedHashSet.add(23);
        System.out.println("total elements: "+linkedHashSet);
        linkedHashSet.add(43);
        linkedHashSet.add(97);
        System.out.println("total elements: "+linkedHashSet);
        System.out.println("Removing element: "+linkedHashSet.remove(97)); 
        System.out.println("total elements: "+linkedHashSet);
    }
}
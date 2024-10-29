import java.util.TreeSet;
public class TreeSetExa {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(23);
        treeSet.add(67);
        treeSet.add(57);
        treeSet.add(43);
        treeSet.add(23);
        System.out.println("total elements: "+treeSet);
        treeSet.add(43);
        treeSet.add(97);
        System.out.println("total elements: "+treeSet);
        System.out.println("Removing element: "+treeSet.remove(97)); 
        System.out.println("total elements: "+treeSet);
    }
}

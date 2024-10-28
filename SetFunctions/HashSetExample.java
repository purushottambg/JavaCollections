import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Hila");
        stringSet.add("Hila");  //Duplicates are not allowed in SET
        stringSet.add("Hanuman");
        stringSet.add("Ramaji");
        System.out.println("All the elements of Hash set: "+stringSet);
        System.out.print("Does it have Hila: " );System.out.println(stringSet.contains("Hila")? "Yes":"NO");
    }
}

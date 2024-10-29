import java.util.HashMap;
import java.util.Map;

public class HashMapExa {
    public static void main(String[] args) {
        Map<Integer, String> ppl = new HashMap<>();
        ppl.put(1, "Purushottam");
        ppl.put(2, "Gokarna");
        ppl.put(3, "Bharat");
        ppl.put(4, "Samrudhhi");
        System.out.println(ppl);
        for (Map.Entry <Integer, String> family : ppl.entrySet()) {
            System.out.println("Key: "+ family.getKey()+ " Value: "+ family.getValue());
        }
        System.out.println("Is map empty: "+ ppl.isEmpty());
        System.out.println("Clearing  out elements");
        ppl.clear();
        System.out.println("Is map empty now: "+ ppl.isEmpty()); 
    }
}

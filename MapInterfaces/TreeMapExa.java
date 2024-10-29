import java.util.TreeMap;
import java.util.Map;
public class TreeMapExa {
    public static void main(String[] args) {
        Map<String, String> tmap = new TreeMap<>();
        tmap.put("Mathura", "Ramrao");
        tmap.put("Gokarna", "Bharat");
        tmap.put("Priti", "Damodhar");
        tmap.put("Pallavi", "Purushottam");
        System.out.println(tmap);
        for(Map.Entry<String, String> couples: tmap.entrySet()){
            System.out.println("Hubby: "+couples.getValue()+" Wife: "+couples.getKey());
        }
    }
}

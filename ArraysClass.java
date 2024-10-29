 
import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int[] arrays = {23,65,32,76,23,546,665,12};
        for (int i : arrays) {
            System.out.println("Current Array and sorting: "+i);
        }
        Arrays.sort(arrays);
        for (int i : arrays) {
            System.out.println("Current Array and sorting: "+i);
        }
        System.out.println("using fill method will add all elements with same element: 9");
        Arrays.fill(arrays, 9);
        for (int i : arrays) {
            System.out.println("Current Array and sorting: "+i);
        }
    }
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList1 {
    
    public static void main(String[] args) {
        System.out.println("This program is written for understanding ArrayList");
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList <>();
        ArrayList<Integer> oddList = new ArrayList<>();
        String continuee="yes";
        do{
            System.out.print("Enter next element: ");
            arrayList.add(scan.nextInt());
            System.out.print("want to stop: ");
            continuee=scan.next();
        }while('n'==continuee.charAt(0)||'N'==continuee.charAt(0));
        scan.close();
        System.out.println(arrayList);
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            if(element%2!=0){
                oddList.add(element);
                iterator.remove();
            }
        }

        System.out.println("new list after removing odds: "+ arrayList+ "\todd ones "+oddList);
         
        arrayList.addAll(oddList); //adding removed elements again
        System.out.println("added all back to the list "+arrayList);
        arrayList.set(arrayList.size()-1, 748);
        System.out.println("used set method here "+arrayList);
    } 
}
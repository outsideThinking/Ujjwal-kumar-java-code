import java.util.ArrayList;
import java.util.Collections;
public class qn2SortingStringDescedingOrder {
    public static void main(String[] args){
        ArrayList<String>l1=new ArrayList<>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("Physics");
        l1.add("Wallah");
        System.out.print("Print the original element ");
        System.out.print(l1);
        System.out.println();
        System.out.print("Print the sorting string desceding order ");
        Collections.sort(l1,Collections.reverseOrder());
        System.out.print(l1);
    }
}

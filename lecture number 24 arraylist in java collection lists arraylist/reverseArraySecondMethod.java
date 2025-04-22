import java.util.ArrayList;
import java.util.Collections;
public class reverseArraySecondMethod {
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.print("Print the original array ");
        System.out.print(list);
        System.out.println();
        System.out.print("print the reverse array ");
        Collections.reverse(list);
        System.out.print(list);
    }
}

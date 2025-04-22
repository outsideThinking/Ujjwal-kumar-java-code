package setInterface;

import java.util.LinkedHashSet;

public class linkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(4);
        lhs.add(7);
        lhs.add(2);
        System.out.println(lhs);
        lhs.add(4);
        lhs.add(2);
        System.out.println(lhs);
    }
}

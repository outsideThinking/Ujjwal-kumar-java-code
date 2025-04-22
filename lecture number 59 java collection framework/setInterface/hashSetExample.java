package setInterface;

import java.util.HashSet;

public class hashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(56);
        hs.add(89);
        hs.add(48);
        System.out.println(hs);
        hs.add(1);
        hs.add(2);
        System.out.println(hs);

        System.out.println(hs.size());
    }
}

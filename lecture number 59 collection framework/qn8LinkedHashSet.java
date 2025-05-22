import java.util.LinkedHashSet;

public class qn8LinkedHashSet {
    static void linkedHashSetExample(){
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(2);
        lhs.add(4);
        lhs.add(1);
        lhs.add(7);
        System.out.println(lhs);
    }
    public static void main(String[] args) {
        linkedHashSetExample();
    }
}

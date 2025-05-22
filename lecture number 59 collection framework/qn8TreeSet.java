import java.util.TreeSet;

public class qn8TreeSet {
    static void treeSetExample(){
        TreeSet<Integer> t=new TreeSet<>();
        t.add(2);
        t.add(1);
        t.add(7);
        t.add(4);
        System.out.println(t); //It is sorted order in
    }
    public static void main(String[] args) {
        treeSetExample();
    }
}

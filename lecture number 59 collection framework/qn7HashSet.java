import java.util.HashSet;

public class qn7HashSet {
    static void hashSetExample(){
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(48);
        hs.add(15);
        System.out.println(hs);
        hs.add(2); //we can't add duplicate element in the set
        System.out.println(hs);
        hs.remove(1); //1 is remove from HashSet
        System.out.println(hs);
        System.out.println(hs.contains(1)); //it will be check 1 is present in the set or not
        System.out.println(hs.size()); //find the size of Hashset
    }
    public static void main(String[] args) {
        hashSetExample();
    }
}

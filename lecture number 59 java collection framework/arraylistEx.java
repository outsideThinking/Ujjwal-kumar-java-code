import java.util.ArrayList;

public class arraylistEx {
    static void arrayListExample(){
        ArrayList<Integer> l=new ArrayList<>();
        l.add(3);
        l.add(9);
        l.add(5);
        System.out.println(l); //3,9,5

        l.set(1,10); //modified on the first index
        System.out.println(l); //3,10,5

        System.out.println(l.contains(12)); //false present

    }
    public static void main(String[] args) {
    arrayListExample();
    }
}

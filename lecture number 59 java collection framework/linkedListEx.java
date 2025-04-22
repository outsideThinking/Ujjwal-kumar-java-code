import java.util.LinkedList;

public class linkedListEx {
    static void linkedListExample(){
        LinkedList<Integer> l=new LinkedList<>();
        l.add(4);
        l.add(9);
        l.add(6);
        System.out.println(l); //4,9,4

        l.set(0,89);
        System.out.println(l); //4,89,6

        System.out.println(l.contains(6)); //true present

    }

    public static void main(String[] args) {
        linkedListExample();

    }
}

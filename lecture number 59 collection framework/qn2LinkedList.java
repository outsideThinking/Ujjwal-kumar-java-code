import java.util.LinkedList;

public class qn2LinkedList {
    static void linkedListExample(){
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(4);
        ll.add(8);
        ll.add(2);
        ll.add(9);
        System.out.println(ll);
        System.out.println(ll.get(1)); //print index no 1
        ll.set(3,6); //modified on the 3 index
        System.out.println(ll);

    }
    public static void main(String[] args) {
        linkedListExample();
    }
}

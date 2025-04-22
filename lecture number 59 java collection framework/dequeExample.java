import java.util.ArrayDeque;
import java.util.Deque;

public class dequeExample {
    static void dequeEx(){
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        System.out.println(dq); //21
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq); //2134

        System.out.println(dq.pollFirst()); //2 //remove first element
        System.out.println(dq.pollLast()); //4 remover last element

        System.out.println(dq); //13
    }
    public static void main(String[] args) {
        dequeEx();

    }
}

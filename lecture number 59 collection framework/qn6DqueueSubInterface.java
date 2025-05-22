import java.util.ArrayDeque;
import java.util.Deque;

public class qn6DqueueSubInterface {
    static void DQueueExample(){
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2); //2,1
        dq.addLast(3); //2,1,3
        dq.addLast(4);
        dq.addFirst((5)); //5,2,1,3,4
        System.out.println(dq); //[5,2,1,3,4]
        System.out.println(dq.peekFirst()); //5
        System.out.println(dq.peekLast()); //4
        System.out.println(dq.pollFirst());
        System.out.println(dq);
    }
    public static void main(String[] args) {
        DQueueExample();
    }
}

import java.util.LinkedList;

public class qn4QueueInterface {
    static void queueExample(){
        LinkedList<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q); //[1,2,3,4]
        System.out.println(q.peek()); //1
        System.out.println(q.poll()); //1 will also remove
        System.out.println(q.peek()); //2
        System.out.println(q.isEmpty()); //false
        System.out.println(q.size()); // size=3
    }
    public static void main(String[] args) {
    queueExample();
    }
}

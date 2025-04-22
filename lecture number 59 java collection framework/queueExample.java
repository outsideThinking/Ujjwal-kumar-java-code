import java.util.LinkedList;

public class queueExample {

    static void queueEx(){
        LinkedList<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(65);
        q.offer(4);
        q.offer(9);
        System.out.println(q); // 1 65 4 9
        System.out.println(q.peek()); //1
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty()); //false
        System.out.println(q.size());
        System.out.println(q);
    }
    public static void main(String[] args) {
    queueEx();
    }
}

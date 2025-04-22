import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueueExample {

    static void priorityQueueEx(){
      //  PriorityQueue<Integer> p=new PriorityQueue<>(); //It is minimum priority queue

        PriorityQueue<Integer> p=new PriorityQueue<>(Comparator.reverseOrder()); // It is maximum priority queue

        p.add(3);
        p.add(6);
        p.add(2);
        p.add(9);
        System.out.println(p);
        System.out.println(p.peek()); //2 - the smallest ele has the highest priority queue
        System.out.println(p.poll()); //2
        System.out.println(p.peek()); //3 after poll second smallest ele has the highest priority
    }
    public static void main(String[] args) {
    priorityQueueEx();
    }
}

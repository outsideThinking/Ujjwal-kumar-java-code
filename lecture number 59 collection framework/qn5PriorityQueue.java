import java.util.PriorityQueue;

public class qn5PriorityQueue {
    static void priorityQueExample(){
        PriorityQueue<Integer> pq=new PriorityQueue<>(); //pq is min
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek()); //smallest element highest priority queue
        System.out.println(pq);
        System.out.println(pq.poll()); //5
        System.out.println(pq);
    }
    public static void main(String[] args) {
        priorityQueExample();
    }
}

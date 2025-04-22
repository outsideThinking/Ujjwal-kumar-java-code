import java.util.LinkedList;
import java.util.Queue;

public class queueOfBasic {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue<Integer>helper=new LinkedList<>();
        while (q.size()>0){
            System.out.print(q.peek()+" ");
            helper.add(q.remove());
        }
        System.out.println();
        while (helper.size()>0){
            System.out.print(helper.peek()+" ");
            q.add(helper.remove());
        }
    }
}

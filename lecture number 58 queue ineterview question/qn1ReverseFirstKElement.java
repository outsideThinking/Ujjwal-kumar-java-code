//reverse first k elements of a queue
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class qn1ReverseFirstKElement{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k=2;
        System.out.println(q);
        Stack<Integer> st=new Stack<>();
        while (q.size()>k){
            st.push(q.poll());
        }
        while (st.size()>0){
                q.add(st.pop());
        }
        System.out.println(q);
        while (q.size()>2){
            q.add(q.remove());
        }
        System.out.println(q);
    }
}
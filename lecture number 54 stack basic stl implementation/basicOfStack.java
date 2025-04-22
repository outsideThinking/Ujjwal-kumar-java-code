import java.util.Stack;
public class basicOfStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(5);
        st.push(4);
        st.push(8);
        st.push(3);
        st.push(9);
        System.out.print(st);
        System.out.println();
        System.out.println("print stack of pick value: "+st.peek());
        st.pop();
        System.out.println("After pop stack is "+st);
        System.out.println("size of stack is:  "+st.size());
    }
}

import java.util.Scanner;
import java.util.Stack;
public class pushAtBottomUsingRecursion {
    public static void pushAtBottom(Stack<Integer> st, int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top=st.pop();
        pushAtBottom(st,x);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()>0) return;
        int top=st.pop();
        reverse(st);
        pushAtBottom(st,top);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int size;
        System.out.println("Enter the stack of size  ");
        size=sc.nextInt();
        System.out.println("Enter the stack of element ");
        for(int i=0;i<size;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("Print before pushing element ");
        System.out.println(st);
        System.out.println("Print after pushing at the bottom on the element ");
        pushAtBottom(st,5);
        System.out.print(st);
    }
}

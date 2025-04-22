import java.util.Scanner;
import java.util.Stack;
public class stackReverseUsingRecursion {
    public static void stackReverseUsingRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
        System.out.print(top+" ");
        stackReverseUsingRec(st);
        //
        // stst.push(top);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int size;
        System.out.println("Enter the stack of size ");
        size=sc.nextInt();
        System.out.println("Enter the stack of element ");
        for(int i=0;i<size;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        stackReverseUsingRec(st);
    }
}

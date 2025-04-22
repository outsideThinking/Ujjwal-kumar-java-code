import java.util.Scanner;
import java.util.Stack;
public class moveStackInReverseOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n;
        System.out.println("Enter the stack of size ");
        n=sc.nextInt();
        System.out.println("Enter the stack of element ");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("Print the stack of element ");
        System.out.print(st);

        Stack<Integer> rt=new Stack<>(); // reverse reverse of code
        while (st.size()>0){
            int x=st.peek();
            rt.push(x);
            st.pop();
        }
        System.out.println(rt);
        System.out.println("Print the reverse of stack ");
        System.out.print(rt);
    }
}

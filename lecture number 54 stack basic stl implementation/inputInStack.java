import java.util.Scanner;
import java.util.Stack;
public class inputInStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n;
        System.out.println("Enter the size of stack ");
        n=sc.nextInt();
        System.out.println("Enter the stack of element ");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println("Print the stack of element ");
        System.out.print(st);
    }
}

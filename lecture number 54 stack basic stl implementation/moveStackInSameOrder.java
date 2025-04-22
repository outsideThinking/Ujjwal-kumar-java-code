//copy contents of one stack to another in same order
import java.util.Scanner;
import java.util.Stack;
public class moveStackInSameOrder {
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
        System.out.println("Print the original stack ");
        System.out.print(st); // reverse stack of code
        Stack<Integer>rt=new Stack<>();
        while (st.size()>0){
            rt.push(st.pop());
        }
        Stack<Integer>qt=new Stack(); //reverse of code
        while (rt.size()>0){
            qt.push(rt.pop());
        }
        System.out.println();
        System.out.print("Print the stack in the same order ");
        System.out.print(qt);
    }
}

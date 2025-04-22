import java.util.Scanner;
import java.util.Stack;
public class indsertAtBotomOrAnyIndex {
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
        int idx=2;
        int value=5;
        Stack<Integer> rt=new Stack<>();
        while (st.size()>idx){
            rt.push(st.pop());
        }
        st.push(value); //insert the element given element
        System.out.println(st);
        while (rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println("after inserting element ");
        System.out.println(st);
    }
}

import java.util.NoSuchElementException;
import java.util.Stack;

class practice{
    public static class Stack{
        int[] arr=new int[50];
        int idx=0;
        void push(int x){
            arr[idx]=x;
            idx++;
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is empty ");
                return -1;
            }
            int top=arr[idx-1];
            idx--;
            return top;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            return false;
        }
        boolean isempty(){
            if(idx==arr.length) return false;
            return true;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is empty ");
            }
            return arr[idx-1];
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(4);
        st.push(8);
        st.push(3);
        st.push(9);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println( st.isFull());
        System.out.println(st.isempty());
    }
}
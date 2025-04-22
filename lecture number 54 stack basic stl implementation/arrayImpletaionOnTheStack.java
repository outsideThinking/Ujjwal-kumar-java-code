import java.util.Scanner;
public class arrayImpletaionOnTheStack {
    public static class Stack{
        int[] arr=new int[50];
        private int idx=0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is full ");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is empty ");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is empty ");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack st=new Stack();
        st.push(5);
        st.push(6);
        st.push(9);
        st.push(8);
        st.push(3);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.size());
    }
}

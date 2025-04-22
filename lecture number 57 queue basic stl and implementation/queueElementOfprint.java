import java.util.Queue;

public class queueElementOfprint {
    public static class Queue{
        int max=10;
        int[] arr=new int[max];
        int size=0;
        int front=-1;
        int rear=-1;
        void add(int x){
        if(rear==max-1){
            System.out.println("queue in not space ");
        }
        else{
            if(rear==-1){
                front=rear=0;
                arr[rear]=x;
                size++;
            }
            else{
                rear=rear+1;
                arr[rear]=x;
                size++;
            }
        }
        }
        int peek(){
            return arr[rear];
        }
        void remove() {
            int x = 0;
            if (rear == -1) {
                System.out.println("queue is empty ");
            } else {
                front = front + 1;
                size--;
            }
        }

        void display(){
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(8);
        q.add(4);
        q.add(7);
        q.add(2);
        q.add(9);
        q.display();
        q.remove();
        q.display();
        System.out.println("queue of size is "+q.size);
        System.out.println(q.peek());
    }
}

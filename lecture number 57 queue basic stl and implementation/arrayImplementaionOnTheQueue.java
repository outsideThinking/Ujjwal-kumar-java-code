public class arrayImplementaionOnTheQueue {
    public static class queueOfArray{
        int front=-1;
        int rear=-1;
        int size=0;
        int[] arr=new int[10];
        void add(int val){
            if(rear==arr.length-1){
                System.out.println("Queue is full ");
                return;
            }
            if(front==-1){
                front=0;
                rear=0;
                arr[0]=val;
                size++;
            }
            else {
                arr[++rear]=val;
                size++;
            }
        }
        int remove(){
            if(size==0){
                System.out.println("queue of empty ");
                return -1;
            }
           int rem=arr[front];
            front++;
            size--;
            return rem;
        }
        int peek(){
            if(size==0){
                System.out.println("queue is empty ");
                return -1;
            }
        return arr[front];
        }
        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
        void display(){
            if(size==0){
                System.out.println("queue is empty ");
            }
            else{
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueOfArray q=new queueOfArray();
        q.add(2);
        q.add(8);
        q.add(6);
        q.add(7);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
    }
}

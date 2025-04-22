class practice{
    public static class queue{
        int max=10;
        int[] arr=new int[max];
        int front=-1;
        int rear=-1;
        int size=0;
        void add(int x){
            if(rear==max-1){
                System.out.println("queue is full ");
            }
           else if(front==-1){
               front=rear=0;
               arr[front]=x;
               size++;
           }
           else{
               rear=rear+1;
               arr[rear]=x;
               size++;
            }
        }
        void remove(){
            if(front==-1){
                System.out.println("queue in no element ");
            }
            else{
                front=front+1;
                size--;
            }
        }
        int size(){
            return size;
        }
        void display(){
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queue q=new queue();
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.size());
    }
}
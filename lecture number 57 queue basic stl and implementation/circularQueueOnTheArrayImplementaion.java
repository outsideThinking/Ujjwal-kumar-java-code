import java.util.function.BooleanSupplier;

public class circularQueueOnTheArrayImplementaion {
    public static class circularQueArrImp{
        int rear=-1;
        int front=-1;
        int size=0;
        int[] arr=new int[4];
        void add(int val){
            if(size==arr.length){
                System.out.println("queue is full ");
                return;
            }
            else if(size==0){
                front=rear=0;
                arr[0]=val;
            }
            else if(rear<arr.length-1){
                arr[++rear]=val;
            }
            else if(rear==arr.length-1){
                rear=0;
                arr[0]=val;
            }
            size++;
        }
        int remove(){
            if(size==0){
                System.out.println("queue is empty ");
                return -1;
            }
          else{
              int val=arr[front];
              if(front==arr.length-1){
                  front=0;
                  size--;
              }
              else{
                  front++;
                  size--;
              }
              return val;
            }
        }
        int peek(){
            if(size==0){
                System.out.println("queue is empty ");
                return -1;
            }
            else {
                return arr[rear];
            }
        }
        void display(){
            if(size==0){
                System.out.println("queue is empty ");
                return;
            }
            else if(front<=rear){
                    for(int i=front;i<=rear;i++){
                        System.out.print(arr[i]+" ");
                    }
            }
            else {
                for(int i=front;i<=arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        circularQueArrImp cla=new circularQueArrImp();
        cla.add(4);
        cla.add(9);
        cla.add(2);
        cla.add(5);
        cla.display();
        cla.remove();
        cla.display();
        cla.add(8);
        cla.display();
    }
}

public class linkedListImplementationOnTheQueue {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static class queueOnLinkedList{
        node head=null;
        node tail=null;
        int size=0;
        void add(int x){
            node temp=new node(x);
            if(head==null){
                head=tail=temp;
            }
            else {
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        void delete(){
            if(size==0){
                System.out.println("stack is empty ");
            }
            else{
                head=head.next;
                size--;
            }
        }
        int peek(){
            return tail.data;
        }
        boolean isempty(){
            if(size==0) return true;
            return false;
        }
        boolean isFull(){
            if(size==0) return false;
            return  true;
        }
        void display(){
            if(size==0){
                System.out.println("queue is empty ");
            }
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    queueOnLinkedList qll=new queueOnLinkedList();
    qll.add(6);
    qll.add(8);
    qll.add(5);
    qll.add(2);
    qll.add(5);
    qll.display();
    qll.delete();
    qll.display();
        System.out.println("queue of peek element is "+qll.peek());
        System.out.println(qll.isempty());
    }
}

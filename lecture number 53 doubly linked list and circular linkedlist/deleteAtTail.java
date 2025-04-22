public class deleteAtTail {
    public static class node{
        int val;
        node next;
        node prev;
        node(int val){
            this.val=val;
        }
    }
    public static class doubleLinkedList{

        node head=null;
        node tail=null;
        void insert(int val){
            node newNode=new node(val);
            if(head==null){
                head=tail=newNode;
            }
            else {
                tail.next=newNode;
                newNode.prev=tail;
                tail=newNode;
            }
        }
        void deleteAtTail(){
            tail=tail.prev;
            tail.next=null;
        }
        void display(){
            node temp=head;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        doubleLinkedList dll=new doubleLinkedList();
        dll.insert(5);
        dll.insert(9);
        dll.insert(3);
        dll.insert(7);
        dll.insert(8);
        dll.display();
        System.out.println("After tail  deletion ");
        dll.deleteAtTail();
        dll.display();
    }
}

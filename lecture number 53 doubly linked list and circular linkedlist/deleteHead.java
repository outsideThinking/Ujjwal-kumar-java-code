public class deleteHead {
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
        void insert(int val){  //insert element of code
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
        void deleteAtHead(){ //delete head of code
           head=head.next;
           head.prev=null;

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
    dll.insert(4);
    dll.insert(2);
    dll.insert(6);
    dll.display();
        System.out.println("After head deletion ");
        dll.deleteAtHead();
        dll.display();
    }
}

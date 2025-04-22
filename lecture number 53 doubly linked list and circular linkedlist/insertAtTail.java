public class insertAtTail {
    public static class node{
        int val;
        node next;
        node prev;
        node(int val){
            this.val=val;
        }
    }
    public static class doubleLinkedlist{
        node head=null;
        node tail=null;
        void insert(int val){
            node newNode=new node(val);
            if(head==null){
                head=tail=newNode;
            }
            else{
                tail.next=newNode;
                newNode.prev=tail;
                tail=newNode;
            }
        }
        void insertAtTail(int val){
            node newNode=new node(val);
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
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
        doubleLinkedlist dll=new doubleLinkedlist();
        dll.insert(5);
        dll.insert(8);
        dll.insert(9);
        dll.insert(2);
        dll.display();
        System.out.println("After adding tail element is ");
        dll.insertAtTail(6);
        dll.display();
    }
}

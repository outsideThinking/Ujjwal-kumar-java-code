public class insertAtHead {
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
                newNode.prev=tail;
                tail.next=newNode;
                tail=newNode;
            }
        }
        node insertAtHead(int val){
            node temp=new node(val);
            temp.next=head;
            head.prev=temp;
            head=temp;
            return head;
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
dll.insert(4);
dll.insert(6);
dll.insert(9);
dll.insert(5);
dll.insert(2);
dll.display();
System.out.println("After adding head in element is ");
dll.insertAtHead(7);
dll.display();
    }
}

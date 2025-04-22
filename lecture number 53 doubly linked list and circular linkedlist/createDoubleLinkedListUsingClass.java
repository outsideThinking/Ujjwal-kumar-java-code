public class createDoubleLinkedListUsingClass {
    public static class node{
        int val;
        node next;
        node pre;
        node(int val){
            this.val=val;
        }
    }
    public static class doublyLinkedList{
        node head=null;
        node tail=null;
        void insert(int val){
            node newNode=new node(val);
            if(head==null){
                head=tail=newNode;
            }
            else{
                newNode.pre=tail;
                tail.next=newNode;
                tail=newNode;
            }
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
        doublyLinkedList dll=new doublyLinkedList();
        dll.insert(5);
        dll.insert(8);
        dll.insert(6);
        dll.insert(7);

        dll.display();
    }
}

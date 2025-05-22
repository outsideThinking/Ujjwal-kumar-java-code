//implement a method to insert a node at the end of a linked list
package linkedList.basicLinkel;


public class qn5ImplementLikedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedList{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
        }
        void insertAtBeginning(int val){
            Node temp=new Node(val);
            if(head==null){
                insertAtBeginning(val);
            }
            else{
                temp=head.next;
                head=temp;
            }
        }
        void Display(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int size(){
            Node temp=head;
            int  count=0;
            while (temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }

    }
    public static void main(String[] args) {
    linkedList ll=new linkedList();
    ll.insertAtEnd(4);
    ll.insertAtEnd(8);
    ll.insertAtEnd(9);
    ll.insertAtEnd(5);
    ll.Display();
        System.out.println();
        System.out.println(ll.size());
        ll.insertAtBeginning(9);
    }
}

//implement a method to insert a node at the start of a linked list
package linkedList.basicLinkel;

public class qn6InsertAtBegning {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
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
            void insertAtBegning(int val){
                Node temp=new Node(val);
                if(head==null){
                    head=temp;
                    tail=temp;
                }
                else{
                    temp.next=head;
                    head=temp;
                }
            }
            void Display(){
                Node temp=head;
                while (temp!=null){
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                }
                System.out.println();
            }

        }

    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.insertAtEnd(6);
        ll.insertAtEnd(9);
        ll.insertAtEnd(2);
        ll.insertAtEnd(8);
        ll.Display();
        ll.insertAtBegning(2);
        ll.Display();

    }
}

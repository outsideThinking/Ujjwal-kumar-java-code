import java.util.Scanner;
class practice{
    public static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
        }
    }
        public static class linkedList {
            Node head = null;
            Node tail = null;

            void insertAtEnd(int val) {
                Node temp = new Node(val);
                if (head == null) {
                    head = temp;
                    tail = temp;
                } else {
                    tail.next = temp;
                    tail = temp;
                }
            }
            void deleteAtIdx(int idx){
                Node temp=head;
                for(int i=0;i<idx;i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next;

            }

            void insertAtBeginning(int val){
                Node temp=new Node(val);
                if(head==null){
                    insertAtBeginning(val);
                }
                else {
                    temp.next=head;
                    head=temp;
                }
            }
            void insertAtGivenInde(int val, int idx){
                Node t=new Node(val);
                Node temp=head;
                if(head==null){
                    insertAtEnd(val);
                }
                else{
                    for(int i=0;i<idx;i++){
                        temp=temp.next;
                    }
                    t.next=temp.next;
                    temp.next=t;
                }
            }
            void display() {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(5);
        ll.insertAtEnd(9);
        ll.insertAtEnd(9);
        ll.display();
        ll.insertAtBeginning(8);
        ll.display();
        ll.insertAtGivenInde(3,2);
        ll.display();
    }
}
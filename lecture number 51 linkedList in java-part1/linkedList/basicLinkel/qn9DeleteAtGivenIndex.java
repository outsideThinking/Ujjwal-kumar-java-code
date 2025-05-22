package linkedList.basicLinkel;

public class qn9DeleteAtGivenIndex {
    public static class Node {
        Node next;
        int data;

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
                else {
                    tail.next=temp;
                    tail=temp;
                }
            }
            void deleteAtGivenNode(int idx){
                Node temp=head;
                if(idx==0){
                    head=head.next;
                    return;
                }
                    for(int i=1;i<=idx-1;i++){
                        temp=temp.next;
                    }
                    temp.next=temp.next.next;
                    tail=temp;


            }
            void display(){
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
    ll.insertAtEnd(3);
    ll.insertAtEnd(5);
    ll.insertAtEnd(9);
    ll.insertAtEnd(4);
    ll.insertAtEnd(1);
    ll.display();
    ll.deleteAtGivenNode(2);
    ll.display();
    }
}

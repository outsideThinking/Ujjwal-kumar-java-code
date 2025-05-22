//getElement method
//implement a method to return the element at any given index of the linked list
package linkedList.basicLinkel;

public class qn8GiveElementAtGivenIndex {
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
            void giveValueGivenIdx(int idx){
                Node temp=head;
                for(int i=0;i<idx;i++){
                    temp=temp.next;
                }
                System.out.println(temp.data);
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
        ll.insertAtEnd(4);
        ll.insertAtEnd(3);
        ll.insertAtEnd(9);
        ll.insertAtEnd(6);
        ll.Display();
        ll.giveValueGivenIdx(2);
    }
}

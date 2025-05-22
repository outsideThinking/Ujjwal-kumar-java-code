//insert method
//implement a method to insert a node at any give index
package linkedList.basicLinkel;

public class qn7InsertAtIndex {
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
            else {
                tail.next=temp;
                tail=temp;
            }
        }
        void insertAtBening(int val){
            Node t=new Node(val);

            Node temp=head;
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                t.next=head;
                head=t;
            }
        }
        void insertAtIndex(int idx, int val){
            Node t=new Node(val);
            Node temp=head;
            if(idx==size()){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAtBening(val);
                return;
            }
            else if(idx<0){
                System.out.println("wrong index please enter right index");
                return;
            }
            else if(idx>size()){
                System.out.println("wrong index please enter right index");
                return;
            }
            for(int i=1;i<idx;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        int size(){
            Node temp=head;
            int count=0;
            while (temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
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
    ll.insertAtEnd(3);
    ll.insertAtEnd(9);
    ll.insertAtEnd(6);
    ll.insertAtEnd(2);
    ll.Display();
    ll.insertAtIndex(2,45);
    ll.Display();
        System.out.println(ll.size());
    ll.insertAtIndex(5,89);
    ll.Display();
    ll.insertAtBening(5);
    ll.Display();

    ll.insertAtIndex(0,90);
    ll.Display();
    ll.insertAtIndex(43,453);
    }
}

package linkedList.basicLinkel;

public class qnlinkedListPrintUsingFunction {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void Display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(9);
        Node c=new Node(2);
        Node d=new Node(3);
        a.next=b;
        b.next=c;
        c.next=d;
        Display(a);
    }
}

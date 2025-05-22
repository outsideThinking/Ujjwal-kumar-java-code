//displsy linked list can we do it recursively
package linkedList.basicLinkel;

public class qn3linkedListPrintUsintResursion {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void displayRecu(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        displayRecu(head.next);
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(4);
        Node c=new Node(9);
        Node d=new Node(1);
        a.next=b;
        b.next=c;
        c.next=d;
        displayRecu(a);
    }
}

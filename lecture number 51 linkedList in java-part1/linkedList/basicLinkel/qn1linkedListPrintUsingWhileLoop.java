//display linked list using for loop
package linkedList.basicLinkel;

public class qn1linkedListPrintUsingWhileLoop {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(9);
        Node c=new Node(3);
        Node d=new Node(8);
        Node e=new Node(2);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        Node temp=a;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

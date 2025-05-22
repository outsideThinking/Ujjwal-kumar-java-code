//finding  the nth node from the end of the linked list
public class qn2nthNodeFromEndInOneTriversal {
    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    public static Node findNthNodeFromOneTrival(Node head, int n){
        Node fast=head;
        Node slow=head;
        for(int i=0;i<n;i++) {
            fast = fast.next;
        }
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }

            return slow;
    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(6);
        Node c=new Node(5);
        Node d=new Node(9);
        Node e=new Node(8);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        Node q=findNthNodeFromOneTrival(a,2);
        System.out.println(q.data);
    }
}

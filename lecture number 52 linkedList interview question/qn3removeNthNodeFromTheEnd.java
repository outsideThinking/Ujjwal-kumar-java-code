//Removing nth node from the end of linked list
public class qn3removeNthNodeFromTheEnd {
    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    public static Node deleteNode(Node head, int n){
        Node fast=head;
        Node slow=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head= head.next;
            return head;
        }
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
  public static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(8);
        Node c=new Node(5);
        Node d=new Node(9);
        Node e=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
       Node q= deleteNode(a,5);
        display(q);
    }
}

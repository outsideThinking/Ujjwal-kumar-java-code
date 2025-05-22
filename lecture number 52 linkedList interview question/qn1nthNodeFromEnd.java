//finding Nth node from the end of linked list only head is given

public class qn1nthNodeFromEnd {
    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    public static Node findNode(Node head, int n){
        int size=0;
        Node temp=head;
        while (temp!=null){
            size++;
            temp=temp.next;
        }
        int beginningToNode=size-n;
         temp=head;
        for(int i=0;i<beginningToNode;i++){
            temp=temp.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(5);
        Node c=new Node(9);
        Node d=new Node(2);
        Node e=new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node q=findNode(a,3);
        System.out.println("Nth node from to the end: "+q.data);
    }
}

public class printReverseLinkedlist {
    public static void reverseLinkedList(node head){
        if(head==null) return;
        reverseLinkedList(head.next);
        System.out.print(head.data+" ");
    }
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        node a=new node(5);
        node b=new node(6);
        node c=new node(8);
        node d=new node(2);
        node e=new node(3);
        node f=new node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        reverseLinkedList(a);
    }
}

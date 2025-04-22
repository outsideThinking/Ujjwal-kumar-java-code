public class functionToPrintLinkedList {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        node a=new node(3);
        node b=new node(9);
        node c=new node(6);
        node d=new node(8);
        node e=new node(2);
        node f=new node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
    }
}

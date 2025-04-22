public class displayLinkedListUsingWhileLoop {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        node a=new node(5);
        node b=new node(9);
        node c=new node(8);
        node d=new node(6);
        node e=new node(3);
        node f=new node(2);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        node temp=a;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

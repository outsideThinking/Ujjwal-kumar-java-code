public class basicLinkedList {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        node a=new node(5);
        node b=new node(8);
        node c=new node(9);
        node d=new node(3);
        node e=new node(10);
        a.next=b; //5 -> 8
        b.next=c; // 5 -> 8 -> 9
        c.next=d;  // 5 -> 8 -> 9 -> 3
        d.next=e;  // 5 -> 8 -> 9 -> 3 ->10
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
    }
}

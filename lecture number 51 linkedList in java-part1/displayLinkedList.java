public class displayLinkedList {
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
        node d=new node(7);
        node e=new node(3);
        a.next=b;  // 5 -> 8
        b.next=c;  // 5 -> 8 -> 9
        c.next=d;  // 5 -> 8 -> 9 -> 7
        d.next=e;  // 5 -> 8 -> 9 -> 7 ->3
        node temp=a;
        for(int i=0;i<5;i++){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

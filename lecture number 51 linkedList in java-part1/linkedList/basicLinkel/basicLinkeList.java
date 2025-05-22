package linkedList.basicLinkel;

public class basicLinkeList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        a.next=b;
        b.next=c;
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
    }
}

public class doubliyLInkList {
    public static class node{
        int val;
        node next;
        node prev;
        node(int val){
            this.val=val;
        }
    }
    public static void disply(node head){
        node temp=head;
        while (temp!=null){
            System.out.print(temp.val +" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void preDisply(node tail){
        node temp=tail;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void displayRand(node rand){ // random node is passed
        node temp=rand;
        while (temp.prev!=null){
            temp=temp.prev;
        }
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        node a=new node(4);
        node b=new node(2);
        node c=new node(9);
        node d=new node(6);
        node e=new node(8);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        System.out.println("Display value ");
        disply(a);
        System.out.println("Display previous value ");
        preDisply(e);
        System.out.println("Display random value to pass ");
        displayRand(c);
    }
}

public class displayLinkedListUsingRecursion {
  public static void recDisplay(node head){ // recursion of code
      if(head==null) return;
      System.out.print(head.data+" ");
      recDisplay(head.next);
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
        node b=new node(9);
        node c=new node(400);
        node d=new node(2);
        node e=new node(3);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        recDisplay(a); //calling recursion
    }
}

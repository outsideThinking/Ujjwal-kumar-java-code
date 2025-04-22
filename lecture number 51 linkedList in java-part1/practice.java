class practice{
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
      node c=new node(2);
      node d=new node(8);
      a.next=b;
      b.next=c;
      c.next=d;
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(c.data);
    }
}
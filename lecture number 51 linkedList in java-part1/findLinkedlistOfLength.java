public class findLinkedlistOfLength {
    public static int countLength(node head){ //count length of code
        int count=0;
        while (head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
   public static class node{
       int data;
       node next;
       node(int data){
           this.data=data;
       }
   }
    public static void main(String[] args) {
        node a=new node(4);
        node b=new node(3);
        node c=new node(9);
        node d=new node(8);
        node e=new node(5);
        node f=new node(4);
        node g=new node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        int ans=countLength(a);
        System.out.println("linkedList of length = "+ans);
    }
}

public class insertAtBegning {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        node head=null;
        node tail=null;
        void insertBegning(int val){
            node temp=new node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else {
                temp.next=head;
                head=temp;
            }
        }
        void display(){
            node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }

        }
    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertBegning(5);
        ll.insertBegning(9);
        ll.insertBegning(3);
        ll.display();
    }
}

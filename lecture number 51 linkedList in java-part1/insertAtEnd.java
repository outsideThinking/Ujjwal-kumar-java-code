public class insertAtEnd {
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
        void insertEnd(int val){
            node temp=new node(val);
            if(head==null){
                head=temp;
            }
            else {
                tail.next=temp;
            }
            tail=temp;
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
        linkedlist ll =new linkedlist();
        ll.insertEnd(4);
        ll.insertEnd(5);
        ll.display();
    }
}

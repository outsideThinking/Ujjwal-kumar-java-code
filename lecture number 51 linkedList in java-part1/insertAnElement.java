public class insertAnElement {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static class linkedList{
        node head=null;
        node tail=null;
        void insert(int val){
            node newNode=new node(val);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else {
                tail.next=newNode;
                tail=newNode;
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
        linkedList ll=new linkedList();
        ll.insert(5);
        ll.insert(7);
        ll.insert(4);
        ll.insert(2);
        ll.insert(8);
        ll.display();
    }
}

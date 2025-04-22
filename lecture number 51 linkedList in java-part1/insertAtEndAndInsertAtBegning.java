public class insertAtEndAndInsertAtBegning {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{ //linkedlist of class
        node head=null;
        node tail=null;
        void insertAtEnd(int val){  //insert at end of code
            node temp=new node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else {
                tail.next=temp;
                tail=temp;
            }
        }
        void insertAtBegning(int val){  //insert at beginning of code
            node begning=new node(val);
            if(head==null){
                head=begning;
                tail=begning;
            }
            else {
                begning.next=head;
                head=begning;
            }
        }
        void display(){  //display of code
            node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(5);
        ll.insertAtEnd(8);
        ll.insertAtEnd(3);
        ll.insertAtBegning(5);
        ll.display();
    }
}

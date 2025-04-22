public class deleteAtGivenIndex {
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
        void insertAtEnd(int val){
            node temp=new node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
        }
        void deleteAtIndex(int idx){
            if(idx==0){
              head=head.next;
              return;
            }
            node del=head;
            for(int i=1;i<idx-1;i++){
                del= del.next;
            }
            del.next=del.next.next;
            tail=del;
        }
        void display(){
            node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(5);
        ll.insertAtEnd(8);
        ll.insertAtEnd(9);
        ll.insertAtEnd(4);
        ll.display();
        System.out.println();
        ll.deleteAtIndex(0);
        ll.display();
    }
}

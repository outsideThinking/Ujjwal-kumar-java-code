public class returnGivenindexOfValue {
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
        void insertAtEnd(int val){ //insert at end of code
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
        int returnIndexOfElement(int idx){ // return index element of value
            node temp=head;
            if(idx<0){
                System.out.println("wrong index");
                return -1;
            }

            for(int i=0;i<idx-1;i++){
                temp=temp.next;

            }
            return temp.data;
        }
        int size(int val){
            node temp=head;
            int count=0;
            while (temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        void display(){
            node temp=head;
            while (temp!=null){
                System.out.print(temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(8);
        ll.insertAtEnd(5);
        ll.insertAtEnd(3);
        System.out.println(ll.returnIndexOfElement(3));
    }
}

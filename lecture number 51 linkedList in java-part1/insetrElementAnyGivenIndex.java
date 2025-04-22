public class insetrElementAnyGivenIndex {
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
        void insertAtBegining(int val){ //insert at beginning of code
            node beginning=new node(val);
            if(beginning==head){
                head=beginning;
                tail=beginning;
            }
            else {
                beginning.next=head;
                head=beginning;
            }
        }
       void insertGivenIdx(int idx, int val){ //insert at given index of code
            node givenIdx=new node(val);
            node temp=head;
            if(idx==size(val)){ //if index is equal to size
                insertAtEnd(val);
                return;
            }
           else if(idx==0){ // if index is equal to 0
                insertAtBegining(val);
                return;
            }
           else if(idx<0){
                System.out.println("Wrong index ");
                return;
           }
           else if(idx>size(val)){
                System.out.println("Wrong index ");
                return;
            }
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            givenIdx.next=temp.next;
            temp.next=givenIdx;
       }
       int size(int val){ //count element of code
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
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(5);
        ll.insertAtEnd(8);
        ll.insertAtEnd(9);
        ll.insertGivenIdx(0 ,4);
        ll.display();
    }
}

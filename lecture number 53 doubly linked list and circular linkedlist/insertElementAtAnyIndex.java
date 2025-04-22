public class insertElementAtAnyIndex {
    public static class node{
        int val;
        node next;
        node prev;
        node(int val){
            this.val=val;
        }
    }
    public static class doubleLinkedList{
        node head=null;
        node tail=null;
        void insert(int val){
            node newNode=new node(val);
            if(head==null){
                head=tail=newNode;
            }
            else{
                tail.next=newNode;
                newNode.prev=tail;
                tail=newNode;
            }
        }
        void insertElementGivenIndex(int idx, int val){
          node temp=head;
          for(int i=0;i<idx-1;i++){
              temp=temp.next;
          }
          node r=temp.next;
          node newNode=new node(val);
          temp.next=newNode;
          newNode.next=r;
          r.prev=newNode;
          newNode.prev=temp;
        }

        void display(){
            node temp=head;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        doubleLinkedList dll=new doubleLinkedList();
        dll.insert(5);
        dll.insert(9);
        dll.insert(3);
        dll.insert(6);
        dll.insert(7);
        dll.display();
        System.out.println("after passing given value on the index ");
        dll.insertElementGivenIndex(2,4);
        dll.display();

    }
}

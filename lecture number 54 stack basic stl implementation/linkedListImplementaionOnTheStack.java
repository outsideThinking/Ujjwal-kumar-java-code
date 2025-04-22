class linkedListImplementaionOnTheStack {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static class linkedListStack{
        node head=null;
        int size=0;
        void push(int x){
            node temp=new node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void pop(){
            head=head.next;
            size--;
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
        linkedListStack llst=new linkedListStack();
        llst.push(4);
        llst.push(6);
        llst.push(9);
        llst.push(2);
        llst.display();
        llst.pop();
        llst.display();
        System.out.println(llst.size);
    }
}

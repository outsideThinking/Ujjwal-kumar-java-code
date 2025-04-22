class practice{
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
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
                else{
                    tail=newNode;
                }
            }
        }
        void display(){
            for(int i=head;)
        }
    }
    public static void main(String[] args) {

    }
}
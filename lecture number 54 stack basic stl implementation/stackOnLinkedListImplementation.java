class stackOnLinkedListImplementation{
    public static class node{
        int data;
        node next;
        node(int data) {
            this.data = data;
        }
    }
    public static class stackOnlinkedImp {
        node head = null;
        int size = 0;

        void push(int data) {
            node temp = new node(data);
            temp.next = head;
            head = temp;
        }

        int pop() {
            node temp = head;
            if (head == null) {
                System.out.println("Stack is empty ");
                return -1;
            } else {
                int x = head.data;
                head = head.next;
                return x;
            }
        }
    }
    public static void main(String[] args) {

    }
}
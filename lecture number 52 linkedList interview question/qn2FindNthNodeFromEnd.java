public class qn2FindNthNodeFromEnd {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }
        public static node nthNodeFromEnd(node head, int n) {
            node temp = head;
            int size = 0;
            while (temp != null) {
                size++;
                temp = temp.next;
            }
            temp = head;
            int firstTo = size - n + 1;
            for (int i = 0; i < firstTo - 1; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public static void main(String[] args) {
            node a = new node(5);
            node b = new node(4);
            node c = new node(2);
            node d = new node(9);
            node e = new node(3);
            node f = new node(8);
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            e.next=f;
            node q = nthNodeFromEnd(a, 2);
            System.out.println(q.data);
        }
    }

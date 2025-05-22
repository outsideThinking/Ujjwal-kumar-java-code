public class qn4findingTheMiddleElement {
    public static class Node {
        Node next;
        int data;
        Node(int data) {
            this.data = data;
        }
    }

    public static Node findMiddle(Node head) {
        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        temp = head;

        // ✅ Simplified logic for both even and odd
        for (int i = 0; i < size / 2; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(8);
        Node c = new Node(5);
        Node d = new Node(2);
         Node e = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
         d.next = e;
        Node q = findMiddle(a);
        System.out.println(q.data);
    }
}

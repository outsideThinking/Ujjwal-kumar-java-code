
public class qn1DeleteNodeAsPareameter {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) { //insert at end of code
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void deleteNode(Node value) { //delete as a parameter of code
            if (value == null || value.next == null) {
                // Cannot delete the node if it is null or the last node
                return;
            }

            value.data = value.next.data;
            value.next = value.next.next;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);
        ll.insertAtEnd(9);
        ll.insertAtEnd(2);

        System.out.println("Original linked list:");
        ll.display();

        // Assuming you want to delete the node with value 6
       // Node value = ll.head.next.next;
        ll.deleteNode(ll.head.next.next); //call delete function

        System.out.println("\nLinked list after deletion:");
        ll.display();
    }
}



//implement a method to find out the length of a linked list(iterative and recursive)
package linkedList.basicLinkel;

import java.lang.module.FindException;

public class qn4findTheLength {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int FindLength(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(8);
        Node c=new Node(2);
        Node d=new Node(8);
        a.next=b;
        b.next=c;
        c.next=d;

        System.out.println(FindLength(a));
    }

}

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution15 {

    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        // If the list is empty, return the new node as head
        if (head == null) {
            return newNode;
        }

        // Traverse to the last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Insert new node at the end
        current.next = newNode;

        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int T = sc.nextInt();

        while (T-- > 0) {
            int data = sc.nextInt();
            head = insert(head, data);
        }

        display(head);
        sc.close();
    }
}

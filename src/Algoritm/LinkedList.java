package Algoritm;

public class LinkedList {
    Node head;

     static class Node {
        int key;
        Node next;
        Node prev;

        Node(int k) {
            key = k;
            next = null;
            prev = null;
        }
    }

    public void insertAtHead(Node x) {
        if (head == null) {
            head = x;
            x.prev = null;
            x.next = null;
        } else {
            x.next = head;
            head.prev = x;
            x.prev = null;
            head = x;
        }
    }
}
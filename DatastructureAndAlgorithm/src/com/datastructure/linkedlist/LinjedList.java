package com.datastructure.linkedlist;

public class LinjedList {
    public static void main(String[] args) {
        Node head = null;
        head = insertFirst(head, 1);
        head = insertNode(head, 2);
        head = insertNode(head, 3);
        head = insertNode(head, 4);
        head = insertNode(head, 5);
        head = insertAtAnyPosition(head, 10, 2);
        head = insertLast(head, 10);
        int count = countList(head);
//        bubbleSortList(head, count);
        System.out.println(count);
        System.out.println("linked list");
        printList(head);
        head = reverseList(head);
        System.out.println("reverse linked list");
        printList(head);
//        head = deleteFirst(head);
//        head = deleteLast(head);
//        head = deleteAAnyKey(head, 4);
    }

    private static Node insertNode(Node head, int i) {
        Node headNode = head;
        Node newNode = new Node(i);
        newNode.next = null;

        if (headNode == null) {
            head = newNode;
        } else {
            while (headNode.next != null) {
                headNode = headNode.next;
            }
            headNode.next = newNode;
        }

        return head;
    }

    private static Node insertFirst(Node head, int i) {
        Node newNode = new Node(i);
        newNode.next = head;
        return newNode;
    }

    private static void insertFirst2(Node head, int i) {
        Node newNode = new Node(i);
        newNode.next = head;
        head=newNode;
    }

    private static Node insertLast(Node head, int i) {
        Node headNode = head;
        Node newNode = new Node(i);
        newNode.next = null;

        while (headNode.next != null) {
            headNode = headNode.next;
        }
        headNode.next = newNode;

        return head;
    }

    public static Node insertAtAnyPosition(Node head, int data, int position) {
        Node refNode = head, pre = head;
        Node newNode = new Node(data);
        int counter = 0;
        while (refNode != null && position != counter) {
            pre = refNode;
            refNode = refNode.next;
            counter++;
        }
        pre.next = newNode;
        newNode.next = refNode;
        return head;
    }


    public static Node deleteFirst(Node head) {
        head = head.next;
        return head;
    }

    public static Node deleteLast(Node head) {
        Node refNode = head;
        while (refNode.next.next != null) {
            refNode = refNode.next;
        }
        refNode.next = null;
        return head;
    }

    public static Node deleteAAnyKey(Node head, int data) {
        Node refNode = head, pre = head;
        while (refNode != null && refNode.data != data) {
            pre = refNode;
            refNode = refNode.next;
        }
        pre.next = refNode.next;
        return head;
    }

    public static void printList(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }

        System.out.println("null");
    }

    public static int countList(Node head) {
        int c = 0;
        while (head != null) {
            head = head.next;
            c++;
        }
        return c;
    }

    public static Node reverseList(Node head) {
        Node current = head, prev = null, nextNode;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
        return head;
    }

//    public static Node bubbleSortList(Node head, int count) {
//        Node n1, n2;
//        int k = count;
//        for (int i = 0 ; i< count; i++){
//            for (int j=1; j< k; j++){
//
//            }
//        }
//        return null;
//    }

}


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
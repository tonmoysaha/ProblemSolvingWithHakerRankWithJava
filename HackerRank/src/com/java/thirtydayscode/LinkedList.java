package com.java.thirtydayscode;

import java.util.Scanner;

<<<<<<< HEAD
public class LinkedList {

	public static Node insert(Node head, int data) {
		Node current = head;
		Node node = new Node(data);

		if (current == null) {
			head = node;
		} else {
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
		}

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
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}

}

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}
=======
import org.w3c.dom.Node;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Scanner sc = new Scanner(System.in);
//	        Node head = null;
//	        int N = sc.nextInt();
//
//	        while(N-- > 0) {
//	            int ele = sc.nextInt();
//	            head = insert(head,ele);
//	        }
//	        display(head);
//	        sc.close();

	}

}
>>>>>>> 78fb7e35bfb8b28e40c791bd770983f71c7e920d

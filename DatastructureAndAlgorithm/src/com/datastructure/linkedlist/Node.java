package com.datastructure.linkedlist;

public class Node {
	
	Node next;
	int data;
	
	public Node(int newData) {
		this.data = newData;
		this.next = null;
	}

	public Node(Node newnext, int newData) {
		this.next = newnext;
		this.data = newData;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}

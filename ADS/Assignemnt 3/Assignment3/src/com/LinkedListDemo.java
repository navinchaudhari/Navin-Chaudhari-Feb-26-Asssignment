package com;

public class LinkedListDemo {

	private static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	Node head;
	
	void insertAtBegining(int value) {
		Node newNode=new Node(value);
		
		if (head==null) {
			head=newNode;
			return;
		}
		
	}

	void inserAtEnd(int value) {
		Node newNode = new Node(value);

		if (head == null) {
			head = newNode;
			return;
		}

		Node current = head;

		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		System.out.println(newNode.data + " Added");

	}

	void display() {
		if (head == null) {
			System.err.println("Linked is Empty......");
			return;
		}
		
		System.out.println("Elements of LinkedList: ");

		Node curreNode = head;
		while (curreNode != null) {
			System.out.print(curreNode.data + " ");
			curreNode = curreNode.next;
		}
	}

	public static void main(String[] args) {
		LinkedListDemo ll = new LinkedListDemo();
		ll.inserAtEnd(10);
		ll.inserAtEnd(20);
		ll.display();

	}

}

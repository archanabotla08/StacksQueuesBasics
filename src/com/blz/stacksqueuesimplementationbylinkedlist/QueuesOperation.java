package com.blz.stacksqueuesimplementationbylinkedlist;

public class QueuesOperation {

	public int size;
	public Node front, rear;

	public QueuesOperation() {
		size = 0;
		front = null;
		rear = null;
	}

	public void insert(int data) {
		Node newNode = new Node(data, null);

		if (rear == null) {
			rear = newNode;
			front = newNode;
		} else {
			rear.setNextRefernce(newNode);
			rear = rear.getNextReference();
		}
		size++;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty Cannot dequeue ");
		}
		Node temp = front;
		front = temp.getNextReference();
		size--;
		if(front == null) {
			rear = null;
		}
		return temp.getData();
	}

	public void display() {
		System.out.println("Queue : ");
		if (rear == null) {
			System.out.println("Queue is Empty");
		}
		Node temp = front;
		while (temp != rear.getNextReference()) {
			System.out.println(temp.getData());
			temp = temp.getNextReference();
		}
	}

	public static void main(String[] args) {
		QueuesOperation queueOperation = new QueuesOperation();
		queueOperation.insert(56);
		queueOperation.insert(30);
		queueOperation.insert(70);
		queueOperation.display();
		System.out.println("Dequeue Element :" + queueOperation.dequeue());
		queueOperation.display();
	}

}

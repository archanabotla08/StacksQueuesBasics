package com.blz.stacksqueuesimplementationbylinkedlist;

public class QueuesOperation {

	public int size;
	public Node front,rear;
	
	public QueuesOperation() {
		size = 0;
		front = null;
		rear = null;
	}
	public void insert(int data) {
		Node newNode = new Node(data,null);
		
		if(rear == null) {
			rear = newNode;
			front = newNode;
		}else {
			rear.setNextRefernce(newNode);
			rear = rear.getNextReference();
		}
		size++;
	}
	public void display() {
		System.out.println("Queue : ");
		if(rear == null) {
			System.out.println("Queue is Empty");
		}
		while(front !=rear.getNextReference()) {
			System.out.println(front.getData());
			front = front.getNextReference();
		}
	}
	public static void main(String[] args) {
		QueuesOperation queueOperation = new QueuesOperation();
		queueOperation.insert(56);
		queueOperation.insert(30);
		queueOperation.insert(70);
		queueOperation.display();
		
		
	}

}

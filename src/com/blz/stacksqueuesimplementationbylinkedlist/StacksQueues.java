package com.blz.stacksqueuesimplementationbylinkedlist;

public class StacksQueues {
	
	public int size;
	public Node top;
	
	public StacksQueues(){
		size = 0;
		top = null;
	}
	
	public void push(int data) {
		Node newNode = new Node(data,null);
		if(top == null) {
			top = newNode;
		}else {
			newNode.setNextRefernce(top);
			top = newNode;
		}
		size ++;
	}
	public boolean isEmpty() {
		return top == null;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		return top.getData();
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty Cannot Pop");
		}
		Node temp = top;
		top = temp.getNextReference();
		size--;
		return temp.getData();
	}
	public void display() {
		System.out.println("Stack: ");
		if(top == null) {
			System.out.println("Stack is Empty");
		}
		Node temp = top;
		while(temp !=null) {
			System.out.println(temp.getData() + " ");
			temp = temp.getNextReference();
		}
	}
	public void popTillEmpty() {
		while(top != null) {
			pop();
		}
	}
	public static void main(String[] args) {
		StacksQueues stacksQueues = new StacksQueues();
		stacksQueues.push(70);
		stacksQueues.push(30);
		stacksQueues.push(56);
		stacksQueues.display();
		System.out.println("Top Element :" + stacksQueues.peek());
		System.out.println("Pop Element : " + stacksQueues.pop());
		stacksQueues.display();
		stacksQueues.popTillEmpty();
		stacksQueues.display();
	}

}


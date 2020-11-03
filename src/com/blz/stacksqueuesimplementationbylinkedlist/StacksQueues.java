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
	
	public void display() {
		System.out.println("Stack: ");
		if(size == 0) {
			System.out.println("Stack is Empty");
		}
		while(top !=null) {
			System.out.println(top.getData() + " ");
			top = top.getNextReference();
		}
	}
	
	public static void main(String[] args) {
		StacksQueues stacksQueues = new StacksQueues();
		stacksQueues.push(70);
		stacksQueues.push(30);
		stacksQueues.push(56);
		stacksQueues.display();
	}

}

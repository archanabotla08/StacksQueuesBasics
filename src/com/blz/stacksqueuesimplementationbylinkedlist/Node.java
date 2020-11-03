package com.blz.stacksqueuesimplementationbylinkedlist;

public class Node {
	
	public int data;
	public Node nextRefernce;
	
	public Node() {
		data = 0;
		nextRefernce = null;
	}
	
	public Node(int data,Node nextReference) {
		this.data = data;
		this.nextRefernce = nextReference;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setNextRefernce(Node nextRefernce) {
		this.nextRefernce = nextRefernce;
	}
	public Node getNextReference() {
		return nextRefernce;
	}
	
}

package com.beak.lists;

public class DListNode {
	private Object item;
	private DListNode prev;
	private DListNode next;
	
	public DListNode(Object o){
		this.item = o;
	}
	
	public Object getItem() {
		return item;
	}
	public void setItem(Object item) {
		this.item = item;
	}
	public DListNode getPrev() {
		return prev;
	}
	public void setPrev(DListNode prev) {
		this.prev = prev;
	}
	public DListNode getNext() {
		return next;
	}
	public void setNext(DListNode next) {
		this.next = next;
	}
	
	public String toString(){
		return this.item.toString();
	}
	
	
	
}

package com.mahesh.Linkedlist;

public class LinkedList {
    private Node head;
   
	public LinkedList() {
		this.head = null;
	}
	//add item
	public void addItem(String item) {
		Node newNode=new Node(item);
		if(head==null) {
			head=newNode;
			}
		else {
			Node current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=newNode;
		}
	} 
	//display items
	public void displayItems() {
		if(head==null) {
			System.out.println("No Item Found");
			return;
		}
		Node current=head;
		System.out.println(".....Displaying Items in LinkedList Structure.....");
		while(current!=null) {
			System.out.print(current.data+"-> ");
			current=current.next;
		}
		System.out.println("None");	
	}
	
//removing an item
	public void removeItem(String item) {
		Node current=head,previous=null;
		if(current!=null && current.data.equals(item) ) {
			head=current.next;
			System.out.println("Removed "+item+" from Cart");
		}
	      while(current!=null && !current.data.equals(item)) {
	    	  previous=current;
	    	  current=current.next;
	      }
	      if(current==null) {
	    	  System.out.println("Item not found");
	    	  return;
	      }
	}
}

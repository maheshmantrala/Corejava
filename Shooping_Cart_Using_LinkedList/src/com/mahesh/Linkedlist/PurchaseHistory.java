package com.mahesh.Linkedlist;

import java.util.Stack;

public class PurchaseHistory {
	private Stack<String>stack;
	public PurchaseHistory() {
		stack=new Stack<>();
	}

	public void push(String item) {
		stack.push(item);
	}
	public String pop() {
		if(!stack.isEmpty()) {
			return stack.pop();
		}
		else {
			System.out.println("No Purchases to undo");
			return null;
		}
	}
	public void displayStack() {
		if(stack.isEmpty()) {
			System.out.println("Purchase History is Empty");
		}else {
			for(int i=stack.size()-1;i>=0;i--) {
				System.out.println(stack.get(i));
			}
		}
	}


}

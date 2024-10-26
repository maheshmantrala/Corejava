package com.mahesh.Linkedlist;

import java.util.Queue;
import java.util.LinkedList;
public class CustomerService {
   private Queue<String>queue;
   
   public CustomerService() {
	   queue=new LinkedList<>();
   }
   public void enqueue(String request) {
	   queue.add(request);
   }
   public String dequeue() {
	   if(!queue.isEmpty()) {
		   return queue.poll();
	   }else {
		   System.out.println("No Customer Requests");
		   return null;
	   }
   }
   public void displayQueue() {
	   if(queue.isEmpty()) {
		   System.out.println("No Customer Requests");
	   }else {
		   for(String request:queue) {
			   System.out.println(request);
		   }
		   }
   }
   
}

package com.mahesh.Linkedlist;

public class Main {
	public static void main(String[] args) {
   LinkedList l=new LinkedList();
   System.out.println(".....Welcome To Mahesh_Shopping_Cart.....");
     l.addItem("Earphones");
     l.addItem("Mobiles");
     l.addItem("Books");
     System.out.println("Items in Cart Before Removing...");
     l.displayItems();
     l.removeItem("Earphones");
     System.out.println("Items in Cart After Removing...");
   l.displayItems();
   
   //purchaseHistory
   PurchaseHistory purchase=new PurchaseHistory();
  System.out.println("....Purchased History....");
   purchase.push("Earphones");
   purchase.push("Mobiles");
   purchase.displayStack();

   //Customer Service
   CustomerService service=new CustomerService();
   System.out.println("....Issues related to customer....");
   service.enqueue("Order Issue");
   service.enqueue("Refund Request");
   service.displayQueue();
 
	}
}

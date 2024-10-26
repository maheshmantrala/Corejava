package com.mahesh.milestone1;
import java.util.Stack;

public class PurchaseHistory {
    private Stack<ShoppingCart> history;

    public PurchaseHistory() {
        history = new Stack<>();
    }

    public void saveCart(ShoppingCart cart) {
        history.push(cart);
    }

    public ShoppingCart undoLastPurchase() {
        return history.pop();
    }

    public void viewHistory() {
        System.out.println("Purchase History:");
        for (ShoppingCart cart : history) {
            System.out.println(cart);
        }
    }
}
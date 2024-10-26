package com.mahesh.milestone1;

public class Menu {
    private ShoppingCart cart;
    private PurchaseHistory history;
    private CustomereService service;

    public Menu() {
        cart = new ShoppingCart();
        history = new PurchaseHistory();
        service = new CustomereService();
    }

    public void runApp() {
        while (true) {
            System.out.println("Welcome To Mahesh_E-commerce_App. ");
            System.out.println("Choose your Option");
            System.out.println("1. Add item to cart");
            System.out.println("2. Remove item from cart");
            System.out.println("3. View your cart");
            System.out.println("4. Checkout");
            System.out.println("5. View purchase history");
            System.out.println("6. Undo last purchase");
            System.out.println("7. Add customer service request");
            System.out.println("8. Process customer service requests");
            System.out.println("9. View pending requests");
            System.out.println("10. Exit");

            int choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter item to add: ");
                    String item = System.console().readLine();
                    cart.addItem(item);
                    System.out.println(".....Item added Successfully.....");
                    break;
                case 2:
                    System.out.print("Enter item to remove: ");
                    item = System.console().readLine();
                    cart.removeItem(item);
                    System.out.println(".....item removed Successfully.....");
                    break;
                case 3:
                    cart.viewCart();
                    break;
                case 4:
                	System.out.println("Items in Cart  Saved to PurchasedHistory Successfully");
                    history.saveCart(cart);
                    cart = new ShoppingCart();
                    break;
                case 5:
                	System.out.println("Displaying Purchase History");
                    history.viewHistory();
                    break;
                case 6:
                    cart = history.undoLastPurchase();
                    break;
                case 7:
                    System.out.print("Enter customer service request: ");
                    String request = System.console().readLine();
                    System.out.println("Request added Successfully");
                    service.addRequest(request);
                    break;
                case 8:
                    service.processRequests();
                    break;
                case 9:
                    service.viewPendingRequests();
                    break;
                case 10:
                
                    System.out.println("Thank You for Using Mahesh_E-commerce_App.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

    public static void main(String[] args) {
        Menu app = new Menu();
        app.runApp();
    }
}

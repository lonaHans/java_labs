package org.example;

public class ShoppingTotal {

//    Create ShoppingTotal. Store a product name, unit price, and quantity. Calculate and display the total cost.
//    Challenge: Apply a discount percentage and display the final amount.
    public void getTotalPrice(){
        String productName = "sneakers";
        int quantity = 2;
        double price = 2000,discount = 0.5, totalPrice;

        totalPrice = (quantity * price) -((quantity * price)* discount);
        System.out.println("The total price of the " + productName +" is: R" + totalPrice);
    }
}

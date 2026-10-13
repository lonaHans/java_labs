package org.example;

public class ShoppingTotal {
    public void getTotalPrice(){
        String productName = "sneakers";
        int quantity = 2;
        double price = 2000,discount = 0.5, totalPrice;

        totalPrice = (quantity * price) -((quantity * price)* discount);
        System.out.println("The total price of the " + productName +" is: R" + totalPrice);
    }
}

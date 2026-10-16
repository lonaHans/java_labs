package org.example;

public class Product_ {

//    Create a Product class with name, price, and quantity.
//    In the main class, create an array of at least four products, calculate line totals and the subtotal, apply a 10% discount if the subtotal exceeds 1,000, and display a receipt with line totals, subtotal, discount, and final total.
//Challenge: Reject negative prices and quantities.
    String name;
    double price;
    int quantity;

    public Product_(String name, double price, int quantity) {

        if(price < 0 || quantity < 0){
            System.out.println("Price and quantity cannot be negative numbers!!");

        }
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double lineTotal(){

        return this.price * this.quantity;
    }
}

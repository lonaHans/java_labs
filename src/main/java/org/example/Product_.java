package org.example;

public class Product_ {
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

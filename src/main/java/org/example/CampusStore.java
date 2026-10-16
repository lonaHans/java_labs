package org.example;

public class CampusStore {
//    Build a Java program for a small campus store. It must include:
//    A Product class with private fields, a constructor, and appropriate methods.
//    An array of at least five product objects.
//    Variables for quantities, prices, subtotal, discount, and total.
//    if statements to validate quantities and apply a discount.
//    A loop to display products and calculate the subtotal.
//    A search feature to find a product by ID or name.
//    A sale operation that updates stock and rejects sales when stock is insufficient.
//    A receipt showing purchased items and the final total.
//    Meaningful variable names and clear output.
//    Tests for valid input, invalid input, empty stock, and selling the exact remaining quantity.

     private int quantity;
     private String name;
     private String id;
     private double price;
     private int stockQuantity;

    public CampusStore(int quantity, String name, String id, double price, int stockQuantity) {
        this.quantity = quantity;
        this.name = name;
        this.id = id;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void display(){
        System.out.println("Product: " + name);
        System.out.println("Price: R" + price);
        System.out.println("Quantity: " +quantity);

    }

    public void addStock(int quantity) {
        if (quantity > 0) {
            stockQuantity = stockQuantity + quantity;
            System.out.println("Stock added successfully.");
        } else {
            System.out.println("Invalid stock quantity.");
        }
    }

    public boolean soldProduct(int quantity) {
        if (quantity > 0 && quantity <= stockQuantity) {
            stockQuantity = stockQuantity - quantity;
            //System.out.println("Sale successful.");
            return true;
        } else {
            System.out.println("Invalid sale.");
            return false;
        }
    }

    public boolean processSale(){
        if(soldProduct(quantity)){
            return true;
        }
        return false;
    }

    public boolean isQuantityAvailable(){
        return quantity > 0;
    }


    public double totalAmount(){
        return this.price * this.quantity;
    }

    public boolean matchesName(String searchedName) {

        return name.equals(searchedName);
    }




}

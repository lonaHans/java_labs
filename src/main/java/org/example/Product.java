package org.example;

public class Product {

//    Create a Product class with product ID, name, price, and stock quantity.
//    Add methods to display details, add stock, reduce stock after a sale, and calculate stock value (price * quantity).
//    Do not allow sales that exceed available stock.

    String id,name;
    double price;
    int stockQuantity;

    public Product(String id,String name,double price,int stockQuantity){
        this.name = name;
        this.id = id;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void getDetails(){
        System.out.println("Product id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: R" + price);
        System.out.println("Stock quantity: " + stockQuantity);
        System.out.println("Stock value is: R" + stockValue());
    }

    public void addStock(int quantity) {
        if (quantity > 0) {
            stockQuantity = stockQuantity + quantity;
            System.out.println("Stock added successfully.");
        } else {
            System.out.println("Invalid stock quantity.");
        }
    }

    public void soldProduct(int quantity) {
        if (quantity > 0 && quantity <= stockQuantity) {
            stockQuantity = stockQuantity - quantity;
            System.out.println("Sale successful.");
        } else {
            System.out.println("Invalid sale.");
        }
    }

    public double stockValue() {
        return price * stockQuantity;
    }

}

package org.example;

public class Car {
    String color, brand,model;
    int year;

    public Car(String color,String brand,String model,int year){
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void display(){
        System.out.println("Colour: " + this.color + "\n" + "Brand: " + this.brand + "\n" + "Model: " + this.model + "\n" + "Year: " + this.year);
    }
}

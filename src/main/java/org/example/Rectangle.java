package org.example;

public class Rectangle {

//    Create a Rectangle class with width and height. Add methods for area (width * height) and perimeter (2 * (width + height)).
//    Create two objects with different dimensions and display the results.

    double width,height;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public void area(){
        double area;
        area = this.height * this.width;
        System.out.println("The area is: "+ area);
    }

    public void perimeter(){
        double perimeter = (2 * (this.height + this.width));
        System.out.println("The perimeter is: "+ perimeter);
    }
}

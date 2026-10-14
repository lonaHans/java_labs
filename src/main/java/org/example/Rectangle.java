package org.example;

public class Rectangle {
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

package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        StudentDetails student = new StudentDetails();
        ShoppingTotal shopping = new ShoppingTotal();

        System.out.println("Student name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Average Mark: " + student.avgMark);
        System.out.println("Registered: " + student.status);

        shopping.totalPrice = (shopping.quantity * shopping.price) -((shopping.quantity * shopping.price)* shopping.discount);
        System.out.println("The total price of the items is: R" + shopping.totalPrice);

    }
}

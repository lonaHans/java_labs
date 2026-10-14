package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        StudentDetails student = new StudentDetails();
        student.getStudentDetails();

        ShoppingTotal shopping = new ShoppingTotal();
        shopping.getTotalPrice();

        TemperatureConverter temp = new TemperatureConverter();
        temp.getTemperature();

        PassOrFail result = new PassOrFail();
        result.getMark();

        GradeCalculator cal = new GradeCalculator();
        cal.calculator();

        NumberAnalysis num = new NumberAnalysis();
        num.analysis();

        LoginCheck lg = new LoginCheck();
        lg.isVaild();

        StudentMarks sm = new StudentMarks();
        sm.marks();

        BankAccount ba = new BankAccount("Lona","5214651",2000);
        ba.getBalance();
        ba.deposit(100);
        ba.withdraw(10000);

        Product p = new Product("P214","plates",500,5);
        p.getDetails();
        p.addStock(4);
        p.soldProduct(8);







    }
}

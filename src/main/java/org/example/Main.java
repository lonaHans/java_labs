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





    }
}

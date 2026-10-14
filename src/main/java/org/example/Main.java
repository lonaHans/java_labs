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

        ArrayStatistics as = new ArrayStatistics();
        as.stats();

        ArraySearch search = new ArraySearch();
        search.search();

        EvenOddArray eo = new EvenOddArray();
        eo.evenOdd();

        ReverseArray ra = new ReverseArray();
        ra.reverseNumbers();

        Student student1 = new Student("Lona","123453",40);
        Student student2 = new Student("Lerato", "123002", 88);
        student1.displayDetails();
        student2.displayDetails();





    }
}

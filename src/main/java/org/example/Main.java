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

        BankAccount ba = new BankAccount("Lona","5214651",2000);
        ba.getBalance();
        ba.deposit(100);
        ba.withdraw(10000);

        Car car = new Car("Red","BMW","X6",2025);
        Car car2 = new Car("Blue","ford","mustang",2010);
        Car car3 = new Car("black","ford","raptor",2023);

        Car[] cars = {car,car2,car3};

        for(int i = 0; i < cars.length; i++){
            cars[i].display();
        }

        Rectangle rect = new Rectangle(2,3);
        Rectangle rect1 = new Rectangle(22,31);
        rect.area();
        rect.perimeter();
        rect1.area();
        rect1.perimeter();








    }
}

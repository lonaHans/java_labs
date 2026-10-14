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

        Product p = new Product("P214","plates",500,5);
        p.getDetails();
        p.addStock(4);
        p.soldProduct(8);


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

        Student_ st =  new Student_("Lona", new int[]{40,55,20},"142536");
        Student_ st1 = new Student_("Pamela", new int[] {70,80,101},"251436");
        Student_ st2 = new Student_("Lethabo", new int[] {50,89,70},"284436");

        Student_[] students = {st, st1, st2};
        int passCount = 0;
        Student_ highest = students[0];
        for (int i = 0; i < students.length; i++) {
            students[i].displaySummary();

            if (students[i].hasPassed()) {
                passCount++;
            }
            if (students[i].average() > highest.average()) {
                highest = students[i];
            }
        }

        System.out.println("Number of students passed: " + passCount);

        System.out.println("Student with highest average: "+ highest.name);

        System.out.println("Highest average: " + highest.average());
        System.out.println(" ");

        Product_ p1 = new Product_("Coffee", 25, 4);
        Product_ p2 = new Product_("Sandwich", 45, 5);
        Product_ p3 = new Product_("Muffin", 20, 3);
        Product_ p4 = new Product_("Cake", 50, 6);

        Product_[] products = {p1, p2, p3, p4};

        double subtotal = 0;
        double discount = 0;
        double finalTotal;

        for (int i = 0; i < products.length; i++) {

            double lineTotal = products[i].lineTotal();

            System.out.println("Product: " + products[i].name);
            System.out.println("Price: R" + products[i].price);
            System.out.println("Quantity: " + products[i].quantity);
            System.out.println("Line total: R" + lineTotal);
            subtotal = subtotal + lineTotal;
        }

        if (subtotal > 1000) {
            discount = subtotal * 0.10;
        }

        finalTotal = subtotal - discount;

        System.out.println("Subtotal: R" + subtotal);
        System.out.println("Discount: R" + discount);
        System.out.println("Final total: R" + finalTotal);












    }
}

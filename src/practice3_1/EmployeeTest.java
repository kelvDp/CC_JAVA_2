package practice3_1;

public class EmployeeTest {
    public static void main(String[] args) {

        Engineer person1 = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        Manager person2 = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
        Admin person3 = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);
        Director person4 = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing",
                1_000_000.00);

        person1.printEmployee();
        person2.printEmployee();
        person3.printEmployee();
        person4.printEmployee();

        person1.setName("Jack White");
        person2.raiseSalary(10_000);
        person4.raiseSalary(12_521.25);

        person1.printEmployee();
        person2.printEmployee();
        person3.printEmployee();
        person4.printEmployee();
    }
}

package practice4_1;

public class EmployeeTest {

    public static void printEmployee(Employee emp) {
        System.out.println("Employee type: " + emp.getClass().getSimpleName());
        System.out.println(emp);
    }

    public static void printEmployee(Employee emp, EmployeeStockPlan plan) {
        printEmployee(emp);
        System.out.println("Stock options: " + plan.grantStock(emp) + "\n");
    }

    public static void main(String[] args) {

        Engineer person1 = new Engineer(101, "Jane Smith", "012-34-5678", 120_345.27);
        Manager person2 = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.36, "US Marketing");
        Admin person3 = new Admin(304, "Bill Munroe", "108-23-6509", 75_002.34);
        Director person4 = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36, "Global Marketing",
                1_000_000.00);

        EmployeeStockPlan plan = new EmployeeStockPlan();

        printEmployee(person1, plan);
        printEmployee(person2, plan);
        printEmployee(person3, plan);
        printEmployee(person4, plan);

        person1.setName("Jack White");
        person2.raiseSalary(12_521.25);

        printEmployee(person2, plan);
    }
}

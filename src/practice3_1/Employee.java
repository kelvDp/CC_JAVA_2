package practice3_1;

import java.text.NumberFormat;

public class Employee {

    private int id;
    private String name;
    private String ssn;
    private double salary;

    Employee(int id, String name, String ssn, double salary) {

        this.id = id;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name != null)
            this.name = name;

    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increase) {

        if (increase > 0)
            this.salary += increase;

    }

    public void printEmployee() {

        System.out.println();
        System.out.println("Employee id: " + getId());
        System.out.println("Employee name: " + getName());
        System.out.println("Employee ssn: " + getSsn());
        System.out.println("Employee salary: " + NumberFormat.getCurrencyInstance().format((double) getSalary()));
    }

}

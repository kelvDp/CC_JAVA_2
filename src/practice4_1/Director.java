package practice4_1;

import java.text.NumberFormat;

public class Director extends Manager {
    
    private double budget;

    Director(int id, String name, String ssn, double salary, String deptName, double budget) {
        super(id, name, ssn, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    public String toString() {
        return ("Employee ID: " + getId() + "\n" + "Employee name: " + getName() + "\n" + "Employee ssn: " + getSsn()
                + "\n" + "Employee salary: " + NumberFormat.getCurrencyInstance().format(getSalary()) + "\n"
                + "Department name: " + getDeptName() + "\n" + "Budget:" + getBudget());
    }
}

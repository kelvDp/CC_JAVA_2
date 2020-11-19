package practice4_1;

import java.text.NumberFormat;

public class Manager extends Employee {

    private String deptName;

    Manager(int id, String name, String ssn, double salary, String deptName) {
        super(id, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return this.deptName;
    }

    public String toString() {
        return ("Employee ID: " + getId() + "\n" + "Employee name: " + getName() + "\n" + "Employee ssn: " + getSsn()
                + "\n" + "Employee salary: " + NumberFormat.getCurrencyInstance().format(getSalary()) + "\n"
                + "Department name: " + getDeptName());
    }
}

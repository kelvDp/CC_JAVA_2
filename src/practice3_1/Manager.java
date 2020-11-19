package practice3_1;

public class Manager extends Employee {
    
    private String deptName;

    Manager(int id, String name, String ssn, double salary, String deptName) {
        super(id, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return this.deptName;
    }
}

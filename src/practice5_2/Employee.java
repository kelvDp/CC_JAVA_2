package practice5_2;

public class Employee {

    BenefitHelper bfh = new BenefitHelper();

    private String name;
    private String role;
    private String dept;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String name, String role, String dept, double salary) {
        this.name = name;
        this.role = role;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonusRate() {
        return bfh.calcBonus(salary);
    }

    public double getWithhodlingRate() {
        return bfh.calcWithholding(salary);
    }

    class BenefitHelper {

        private final double bonusRate = 0.02;
        private final double withholdongRate = 0.07;

        public double calcBonus(double salary) {
            return salary * bonusRate;
        }

        public double calcWithholding(double salary) {
            return salary * withholdongRate;
        }
    }

}

package practice5_2;

public class Main {
    public static void main(String[] args) {

        Employee jane = new Employee("Jane Doe", "Manager", "HR", 65000);
        Employee john = new Employee("John Doe", "Staff", "HR", 55000);

        System.out.println("Jane's withholding: " + jane.getWithhodlingRate());
        System.out.println("John's bonus: " + john.getBonusRate());
    }
}

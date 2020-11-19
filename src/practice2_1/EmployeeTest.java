package practice2_1;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee person = new Employee();

        person.setId(101);
        person.setName("Jane Smith");
        person.setSsn("012-34-567");
        person.setSalary(120_354.27);

        System.out.println("Employee id: " + person.getId());
        System.out.println("Employee name: " + person.getName());
        System.out.println("Employee ssn: " + person.getSsn());
        System.out.println("Employee salary: " + person.getSalary());

    }
}

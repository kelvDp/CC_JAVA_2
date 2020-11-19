package practice9_2;

import java.util.List;
import java.util.function.ToDoubleFunction;

/**
 *
 * @author oracle
 */
public class FunctionTest {

  public static void main(String[] args) {

    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);

    // Write your function lambda here
    ToDoubleFunction<Employee> eFunc = e -> e.getSalary() * Bonus.byRole(e.getRole());

    System.out.println("=== First Employee Bonus");
    first.printSummary();
    System.out.println("Bonus: " + eFunc.applyAsDouble(first)); // Print the result here

  }
}

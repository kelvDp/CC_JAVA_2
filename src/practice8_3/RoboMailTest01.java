package practice8_3;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author Oracle Streams and filters
 */
public class RoboMailTest01 {

  public static void main(String[] args) {

    List<Employee> pl = Employee.createShortList();
    RoboMail01 robo = new RoboMail01();

    System.out.println("\n==== RoboMail 01");
    System.out.println("\n=== All Sales 50+");

    Predicate<Employee> deptFilter = p -> p.getDept().equals("Sales");
    Predicate<Employee> ageFilter = p -> p.getAge() > 50;

    // Print sales employees 50+

    pl.stream().filter(deptFilter).filter(ageFilter).forEach(p -> robo.roboMail(p));
  }
}

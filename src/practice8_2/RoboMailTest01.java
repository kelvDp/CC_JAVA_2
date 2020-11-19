package practice8_2;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author Oracle Streams and filters
 */
public class RoboMailTest01 {

  public static void main(String[] args) {

    List<Employee> pl = Employee.createShortList();
    RoboMail01 robo = new RoboMail01();

    Predicate<Employee> roleFilter = p -> p.getRole().equals(Role.EXECUTIVE);
    Predicate<Employee> deptFilter = p -> p.getDept().equals("Sales");

    System.out.println("\n==== RoboMail 01");
    System.out.println("\n=== Sales Execs");

    // roboMail Sales Executives
    pl.stream().filter(roleFilter).filter(deptFilter).forEach(p -> robo.roboMail(p));
  }
}

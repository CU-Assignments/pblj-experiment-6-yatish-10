import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 50000));
        employees.add(new Employee("Bob", 25, 60000));
        employees.add(new Employee("Charlie", 35, 55000));
        employees.add(new Employee("David", 28, 70000));

        Collections.sort(employees, Comparator.comparing(emp -> emp.name));
        System.out.println("Employees sorted by name:");
        for (Employee emp : employees) {
            System.out.println(emp.name + ", Age: " + emp.age + ", Salary: " + emp.salary);
        }

        Collections.sort(employees, Comparator.comparingInt(emp -> emp.age));
        System.out.println("\nEmployees sorted by age:");
        for (Employee emp : employees) {
            System.out.println(emp.name + ", Age: " + emp.age + ", Salary: " + emp.salary);
        }

        Collections.sort(employees, Comparator.comparingDouble(emp -> emp.salary));
        System.out.println("\nEmployees sorted by salary:");
        for (Employee emp : employees) {
            System.out.println(emp.name + ", Age: " + emp.age + ", Salary: " + emp.salary);
        }
    }
}

package Task3;

import java.util.*;

public class EmployeeSorting {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 70000));
        employees.add(new Employee("Bob", 25, 50000));
        employees.add(new Employee("Charlie", 28, 60000));
        employees.add(new Employee("David", 35, 90000));

        Collections.sort(employees, (e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        System.out.println("Sorted by Salary (Desc):");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println("\nSorted by Name (Asc):");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}


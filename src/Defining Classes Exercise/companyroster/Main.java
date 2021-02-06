package companyroster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, Department> departments = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split(" ");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];

            Employee employee;
            if (tokens.length == 4) {
                employee = new Employee(
                        name, salary, position, department);
            } else if (tokens.length == 6) {
                String email = tokens[4];
                int age = Integer.parseInt(tokens[5]);
                employee = new Employee(
                        name, salary, position, department, email, age);
            }
            else {
                try {
                    int age = Integer.parseInt(tokens[4]);
                    employee = new Employee(
                            name, salary, position, department, age);
                }
                catch (NumberFormatException ex) {
                    String email = tokens[4];
                    employee = new Employee(
                            name, salary, position, department, email);
                }
            }
            departments.putIfAbsent(department, new Department(department));
            departments.get(department).getEmployees().add(employee);
        }

        Department maxDepartment = departments
                .entrySet()
                .stream()
                //f.getValue().getAverageSalary() - s.getValue().getAverageSalary()
                .max(Comparator.comparingDouble(
                        f -> f.getValue().
                                getAverageSalary()))
                .get()
                // .get () returns Entryset of String and Department,
                // so we use .getValue() to write it in maxDepartment
                .getValue();
        System.out.println("Highest Average Salary:  " +
                maxDepartment.getName());
        maxDepartment
                .getEmployees()
                .stream()
                .sorted((f, s) -> Double.compare(s.getSalary(), f.getSalary()))
                .forEach(System.out::println);
    }
}
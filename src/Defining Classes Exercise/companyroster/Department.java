package companyroster;

import java.util.*;
public class Department {
    private String name;
    public List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }
    public String getName() {
        return this.name;
    }
    List<Employee> getEmployees() {
        return this.employees;
    }
    public double getAverageSalary () {
        return this.employees
                .stream()
                .mapToDouble(e -> e.getSalary())
                .average()
                .orElse(0.0);

//        alternative way
//        double sum = 0.0;
//
//        for (Employee employee : employees) {
//            sum = sum + employee.getSalary();
//        }
//        return sum / this.getEmployees().size();
    }
}
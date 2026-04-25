// import java.util.Arrays;
// import java.util.List;

// public class LambdaExample {
//     public static void main(String[] args) {
//         List<Integer> list = Arrays.asList(1,2,3,4);
//         list.forEach(n-> System.out.println(n));
//         }
// }


import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class LambdaExpression {

    public static void main(String[] args) {

        List<Employee> empList = Arrays.asList(
                new Employee(1, "Amit", 50000),
                new Employee(2, "Rohit", 75000),
                new Employee(3, "Neha", 60000),
                new Employee(4, "Priya", 90000),
                new Employee(5, "Karan", 55000)
        );

        // 🔹 1. Find highest salary employee
        Employee maxSalaryEmp = empList.stream()
                .max((e1, e2) -> Double.compare(e1.salary, e2.salary))
                .get();

        System.out.println("Highest Salary Employee: " 
                + maxSalaryEmp.name + " - " + maxSalaryEmp.salary);

        // 🔹 2. Sort employees by salary (ascending)
        System.out.println("\nEmployees sorted by salary:");

        empList.stream()
                .sorted((e1, e2) -> Double.compare(e1.salary, e2.salary))
                .forEach(e -> System.out.println(e.name + " - " + e.salary));
    }
}
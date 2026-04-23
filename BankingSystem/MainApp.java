package BankingSystem;

import java.util.Scanner;

class SalaryProcessing {

    double calculateNetSalary(double salary) {

        double tax = 0;

        if (salary < 30000) {
            tax = 0;
        } 
        else if (salary >= 30000 && salary <= 70000) {
            tax = salary * 0.10;
        } 
        else {
            tax = salary * 0.20;
        }

        return salary - tax;
    }
}

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        SalaryProcessing sp = new SalaryProcessing();

        double netSalary = sp.calculateNetSalary(salary);

        System.out.println("Net Salary after tax: " + netSalary);

        sc.close();
    }
}
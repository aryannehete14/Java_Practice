package BankingSystem;

import java.util.Scanner;

public class LoanEligibility {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter existing EMI: ");
        int emi = sc.nextInt();

        System.out.print("Enter Loans Paid: ");
        int loansPaid = sc.nextInt();

        int inHand = salary - emi;

        boolean isNewUser = (creditScore == 0 && emi == 0 && loansPaid == 0);

        if (salary < 0 || creditScore < 0 || creditScore > 900 || age <= 0 || emi < 0 || loansPaid < 0) {
            System.out.println("Invalid Input. Fields not valid.");
        } 
        else if (inHand < 5000) {
            System.out.println("Loan Rejected: In-hand salary too low.");
        } 
        else if (isNewUser) {
            if (inHand >= 30000 && age >= 21 && age <= 60) {
                System.out.println("Loan Approved (New User).");
            } else {
                System.out.println("Loan Rejected (New User Criteria Not Met).");
            }
        }
        else if (inHand >= 25000 && creditScore >= 700 && age >= 21 && age <= 60) {
            System.out.println("Loan Approved.");
        } 
        else {
            System.out.println("Loan Rejected.");
        }

        sc.close();
    }
}
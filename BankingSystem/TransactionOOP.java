package BankingSystem;

import java.util.*;

// Encapsulation
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deduct(double amount) {
        balance -= amount;
    }
}

// Abstraction + Business Logic
class TransactionService {

    private final double DAILY_LIMIT = 15000;

    public boolean validate(BankAccount acc, double amount) {

        if (amount > DAILY_LIMIT) {
            System.out.println("Limit exceeded. Max allowed: ₹" + DAILY_LIMIT);
            return false;
        }

        if (amount > acc.getBalance()) {
            System.out.println("LOW BALANCE: Transaction failed");
            return false;
        }

        return true;
    }

    public double calculateCharge(double amount) {
        if (amount > 10000) {
            return amount * 0.02;
        }
        return 0;
    }

    public void withdraw(BankAccount acc, double amount) {

        if (!validate(acc, amount))
            return;

        double charge = calculateCharge(amount);
        double total = amount + charge;

        acc.deduct(total);

        System.out.println("Transaction Approved");
        System.out.println("Charge: Rs." + charge);
        System.out.println("Total Deducted: Rs." + total);
        System.out.println("Remaining Balance: Rs." + acc.getBalance());
    }
}

// Main Class
public class TransactionOOP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount(50000);
        TransactionService service = new TransactionService();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        service.withdraw(acc, amount);
    }
}

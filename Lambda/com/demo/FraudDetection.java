package Lambda.com.demo;

import java.util.*;
import java.util.function.Predicate;

class Transaction {
    int id;
    double amount;
    String location;

    Transaction(int id, double amount, String location) {
        this.id = id;
        this.amount = amount;
        this.location = location;
    }
}

public class FraudDetection {

    public static void main(String[] args) {

        List<Transaction> list = Arrays.asList(
                new Transaction(1, 5000, "India"),
                new Transaction(2, 150000, "USA"),
                new Transaction(3, 2000, "India"),
                new Transaction(4, 300000, "Nigeria"),
                new Transaction(5, 70000, "UK"));

        Predicate<Transaction> highAmount = t -> t.amount > 100000;

        Predicate<Transaction> suspiciousLocation = t -> t.location.equalsIgnoreCase("Nigeria");

        Predicate<Transaction> fraudCheck = highAmount.or(suspiciousLocation);

        System.out.println("Fraud Transactions:");

        list.stream()
                .filter(fraudCheck)
                .forEach(t -> System.out.println(
                        "ID: " + t.id +
                                ", Amount: " + t.amount +
                                ", Location: " + t.location));
    }

}

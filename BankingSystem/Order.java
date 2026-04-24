package BankingSystem;

import java.util.Scanner;

public class Order {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Cart is empty");
            sc.close();
            return;
        }

        int[] prices = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter price of item " + (i + 1) + ": ");
            prices[i] = sc.nextInt();
            total += prices[i];
        }

        if (total > 5000) {
            total = total - 200;
        }

        sc.nextLine(); // consume newline
        System.out.print("Enter coupon code (or press Enter to skip): ");
        String coupon = sc.nextLine();

        if (coupon.equalsIgnoreCase("SAVE10")) {
            total = total - (int)(total * 0.10);
        }

        double gst = total * 0.18;
        double finalAmount = total + gst;

        System.out.println("\nTotal after discount: " + total);
        System.out.println("GST (18%): " + gst);
        System.out.println("Final amount to be paid: " + finalAmount);

        sc.close();
    }
}
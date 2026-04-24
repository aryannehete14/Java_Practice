// package BankingSystem;

// import java.util.*;

// class Product {
//     private String name;
//     private double price;
//     private int quantity;

//     public Product(String name, double price, int quantity) {
//         this.name = name;
//         this.price = price;
//         this.quantity = quantity;
//     }

//     public double getTotalPrice() {
//         return price * quantity;
//     }
// }

// class OrderService {

//     public double calculateTotal(List<Product> items) {
//         double total = 0;
//         for (Product p : items) {
//             total += p.getTotalPrice();
//         }
//         return total;
//     }

//     public double applyDiscount(double total) {
//         return (total > 5000) ? total * 0.10 : 0;
//     }

//     public double applyDeliveryCharge(double total) {
//         return (total < 1000) ? 50 : 0;
//     }
// }

// public class OrderProcessing {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         List<Product> items = new ArrayList<>();

//         System.out.print("Enter number of products: ");
//         int n = sc.nextInt();
//         sc.nextLine(); // consume newline

//         for (int i = 0; i < n; i++) {

//             System.out.println("\nEnter details for product " + (i + 1));

//             System.out.print("Name: ");
//             String name = sc.nextLine();

//             System.out.print("Price: ");
//             double price = sc.nextDouble();

//             System.out.print("Quantity: ");
//             int quantity = sc.nextInt();
//             sc.nextLine(); // consume newline

//             items.add(new Product(name, price, quantity));
//         }

//         OrderService service = new OrderService();

//         double total = service.calculateTotal(items);
//         double discount = service.applyDiscount(total);
//         double delivery = service.applyDeliveryCharge(total);

//         double finalBill = total - discount + delivery;

//         System.out.println("\n------ BILL ------");
//         System.out.printf("Total Amount: Rs.%.2f\n", total);
//         System.out.printf("Discount: Rs.%.2f\n", discount);
//         System.out.printf("Delivery Charge: Rs.%.2f\n", delivery);
//         System.out.printf("Final Bill: Rs.%.2f\n", finalBill);

//         sc.close();
//     }
// }



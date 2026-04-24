import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        int currentPassword = 1234;
        int attempts = 3;
        for (int i=0; i<attempts; i++) {
            int enteredPassword = scanner.nextInt();
            if (enteredPassword == currentPassword) {
                System.out.println("Login successful!");
                break;
            } else {
                if (i == attempts - 1) {
                    System.out.println("Too many failed attempts. Account locked.");
                } else {
                    System.out.println("Incorrect password. Try again.");
                }
            }
        } 
    }
}
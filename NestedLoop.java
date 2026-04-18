import java.util.Scanner;

public class NestedLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Are you Indian Citizen? (yes/no)");
            String citizenship = scanner.next();

            if (citizenship.equals("yes")) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible to vote.");
            }
        } else {
            System.out.println("You are a kiddoo, heheh!");
        }

        // While loop part
        int i = 10;
        while (i > 0) {
            System.out.print(i + ",");
            i--;
        }
        System.out.println("Happy New Year!");

        scanner.close();
    }
}
// Scanner input = new Scanner(System.in);

// int i = 10;
// while (i > 0) {
//     System.out.print(i + ",");
//     i -= 1;
// }
// System.out.println("Happy New Year!");
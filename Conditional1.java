import java.util.Scanner;

public class Conditional1 {

    public static void main(String[] args) {

        String username = "admin";
        String pass = "123";

        String login;
        String password;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Login");
        login = input.nextLine();

        System.out.println("Enter your password");
        password = input.nextLine();

        // Correct way
        if (login.equals(username) && password.equals(pass)) {
            System.out.println("Correct Credentials");
        } else {
            System.out.println("Incorrect credentials");
        }

        input.close();
    }
}
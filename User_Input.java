import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String fname = sc.nextLine();

        System.out.println("My name is " + fname);

        sc.close();
    }
}
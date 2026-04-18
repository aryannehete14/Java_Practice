import java.util.Scanner;

public class MultiUser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your college: ");
        String college = sc.nextLine();

        System.out.print("Enter your CGPA: ");
        float cgpa = sc.nextFloat();

        System.out.println("My name is " + name + ". " +
                "I am a student of " + college + ". " +
                "My cgpa is " + cgpa + ".");

        sc.close();
    }
}
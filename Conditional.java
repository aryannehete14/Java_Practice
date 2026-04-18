// c vs python
// functions
// array
// c - platform dependent
// java - platform independent (bytecode via JVM)
// c - dynamic memory allocation using malloc (pointers)
// java - no explicit pointer concept (handled internally)
// nextFloat()
// nextInt()
// nextLine()
// char → use charAt(0)
import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you have an ID card? (true/false)");
        boolean icard = input.nextBoolean();

        if (icard) {
            System.out.println("You can enter the clg.");
        } else {
            System.out.println("You cannot enter the clg.");
        }

        input.close();
    }
}
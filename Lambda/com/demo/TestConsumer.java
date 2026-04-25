package Lambda.com.demo;

import java.util.function.Consumer;

public class TestConsumer {

    public static void main(String[] args) {

        // Basic Example
        Consumer<Integer> c = n -> System.out.println("Value: " + n);
        c.accept(10);

        // Industry Use Case: Logging System
        Consumer<String> logger = message -> 
                System.out.println("[LOG]: " + message);

        logger.accept("User logged in");
        logger.accept("Order placed successfully");
        logger.accept("Payment completed");
    }
}
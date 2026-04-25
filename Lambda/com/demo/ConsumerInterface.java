package Lambda.com.demo;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerInterface {
    public static void main(String[] args) {

        Consumer<Integer> c = n -> System.out.println(n);

        c.accept(10);

        Predicate<Integer> p = n -> n > 50;
		System.out.println(p.test(60));
    }
}
package Lambda.com.demo;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> 100;
        System.out.println(s.get());
    }
}
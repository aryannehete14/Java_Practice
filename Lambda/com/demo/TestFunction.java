package Lambda.com.demo;

import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {

        // Function: takes Integer, returns Integer
        Function<Integer, Integer> f = n -> n * n;

        System.out.println(f.apply(5)); // 25
    }
}
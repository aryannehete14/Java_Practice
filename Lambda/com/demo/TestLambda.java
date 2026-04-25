package Lambda.com.demo;

@FunctionalInterface
interface MyInterface {
    void show(String msg);
}

public class TestLambda {
    public static void main(String[] args) {

        MyInterface obj = (msg) -> System.out.println(msg);

        obj.show("Hello");
    }
}
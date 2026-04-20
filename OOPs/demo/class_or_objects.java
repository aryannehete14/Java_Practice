package OOPs.demo;

public class class_or_objects {

    int a = 90; // non static

    void hello()// non static
    {
        System.out.println("This is non static.");
    }

    static void hii() // static
    {
        System.out.println("This is static. ");
    }

    public static void main(String[] args) {
        int b = 67; // static variable
        // print a
        class_or_objects co1 = new class_or_objects();
        // non static
        System.out.println(co1.a);
        co1.hello();
        // static
        System.out.println(b);
        hii();
    }   
}

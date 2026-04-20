package OOPs.demo;

public class constructor_001 {

    void cons() 
    {
        System.out.println("This is a method.");
    }

    constructor_001() // default constructor
    {
        System.out.println("This is a constructor......");
    }

    constructor_001(int a, int b, int c)
    {
        System.out.println("Value of abc :: " + a + b + c);
    }
    public static void main(String[] args) {
        constructor_001 c1 = new constructor_001(7,8,9);// constructor call
        constructor_001 c2 = new constructor_001();
        constructor_001 c3 = new constructor_001();

        c1.cons();//method calling
    }

}

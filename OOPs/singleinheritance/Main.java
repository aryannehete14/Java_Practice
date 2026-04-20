package OOPs.singleinheritance;

public class Main {
    public static void main(String[] args) {

        Father f1 = new Father();
        f1.parent();// child class
        System.out.println(f1.a);// father(child) class variable

        //parent class method

        f1.grandParent();

    }

}

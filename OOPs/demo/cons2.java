package OOPs.demo;

public class cons2 {
    int i;
    float m;
    String n;

    cons2(int id, String name, float marks) {
        this.i = id;// this.parameter=class variable
        this.n = name;
        this.m = marks;// current class object
    }

    void display() {
        System.out.println("Student Name :: " + n);
        System.out.println("Student Id:: " + i);

        System.out.println("Student Marks :: " + m);

    }

    public static void main(String[] args) {
        cons2 c11 = new cons2(101,"Aryan", 69.69f);
        c11.display();
        System.out.println("------------------------");
        cons2 c12 = new cons2(102,"Mritunjay", 29.2f );
        c12.display();
        System.out.println("------------------------");
    }

}

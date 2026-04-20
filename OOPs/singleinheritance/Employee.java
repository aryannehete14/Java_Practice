package OOPs.singleinheritance;

public class Employee extends Manager {
    int id = 4545;

    void work() {
        System.out.println("Developing Softwares.....");
    }

    void printids() {
        System.out.println("Manager ID :: " + super.id);
        System.out.println("Employee ID :: " + id);

    }
}

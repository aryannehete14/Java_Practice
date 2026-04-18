import java.util.*;

public class Stack1 {

    public static void main(String[] args) {
        
        Stack <Integer> s = new Stack <>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println(s);

        System.out.println(s.get(2));

        s.push(null);
        System.out.println(s);

        s.pop();
        System.out.println(s);

    }
    
}

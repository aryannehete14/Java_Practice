import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println("Queue: " + q);

        q.offer(60);
        q.offer(70);

        System.out.println("After offer: " + q);

        // remove element
        System.out.println("Removed: " + q.poll());

        // peek front
        System.out.println("Front: " + q.peek());

        // check empty
        System.out.println("Is Empty? " + q.isEmpty());
    }
}
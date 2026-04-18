import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {

        // 1. Create HashSet
        HashSet<String> set = new HashSet<>();

        // 2. add()
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java");   // Duplicate ignored

        System.out.println("HashSet after add(): " + set);

        // 3. size()
        System.out.println("Size: " + set.size());

        // 4. contains()
        System.out.println("Contains Java? " + set.contains("Java"));

        // 5. remove()
        set.remove("C++");

        // 6. isEmpty()
        System.out.println("Is Empty? " + set.isEmpty());

        // 7. iterator()
        System.out.print("Iterator: ");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 8. toArray()
        Object[] arr = set.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // 9. addAll()
        HashSet<String> set2 = new HashSet<>();
        set2.add("Spring");
        set2.add("Hibernate");

        set.addAll(set2);

        // 10. containsAll()
        System.out.println(set.containsAll(set2));

        // 11. removeAll()
        set.removeAll(set2);

        // 12. retainAll()
        HashSet<String> set3 = new HashSet<>();
        set3.add("Java");
        set3.add("Python");

        set.retainAll(set3);

        // 13. clear()
        set.clear();

        // 14. equals()
        HashSet<String> a = new HashSet<>();
        HashSet<String> b = new HashSet<>();

        a.add("One");
        b.add("One");

        System.out.println(a.equals(b));

        // 15. hashCode()
        System.out.println(a.hashCode());
    }
}
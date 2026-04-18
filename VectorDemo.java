// import java.util.Vector;

// public class VectorDemo {

//     public static void main(String[] args) {

//         Vector<Integer> v = new Vector<>();

//         v.add(10);

//         System.out.println("Initial Capacity of Vector is " + v.capacity());

//         v.add(10);
//         v.add(20);
//         v.add(30);
//         v.add(40);
//         v.add(50);

//         v.add(60);
//         v.add(70);
//         v.add(80);
//         v.add(90);
//         v.add(100);

//         v.add(110);

//         // When 11th element is added capacity doubles.

//         System.out.println("Capacity after adding elements: " + v.capacity());
//         System.out.println(v.firstElement());
//         System.out.println(v.lastElement());
//         System.out.println(v);
//         System.out.println(v.getFirst());
//         System.out.println(v.getLast());
//         System.out.println(v.elementAt(9));
//         System.out.println(v.size());
//         System.out.println(v.isEmpty());
//         System.out.println(v.remove(10));
//         System.out.println(v);
//         v.clear();
//         System.out.println(v);
//         System.out.println(v);
//         v.removeElementAt(3);
//         System.out.println(v);
//         System.out.println(v.removeAll(v));
//     }
// }


import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        // 1. add()
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

        System.out.println("Vector: " + v);

        // 2. capacity()
        System.out.println("Capacity: " + v.capacity());

        // 3. size()
        System.out.println("Size: " + v.size());

        // 4. firstElement() & lastElement()
        System.out.println("First Element: " + v.firstElement());
        System.out.println("Last Element: " + v.lastElement());

        // 5. get(index)
        System.out.println("Element at index 2: " + v.get(2));

        // 6. set(index, value)
        v.set(1, 25);
        System.out.println("After set(): " + v);

        // 7. add(index, element)
        v.add(2, 99);
        System.out.println("After add at index: " + v);

        // 8. elementAt()
        System.out.println("Element at index 3 using elementAt(): " + v.elementAt(3));

        // 9. contains()
        System.out.println("Contains 30? " + v.contains(30));

        // 10. indexOf()
        System.out.println("Index of 40: " + v.indexOf(40));

        // 11. isEmpty()
        System.out.println("Is Empty? " + v.isEmpty());

        // 12. remove(index)
        System.out.println("Removed element: " + v.remove(2));
        System.out.println("After remove(): " + v);

        // 13. removeElement(value)
        v.removeElement(40);
        System.out.println("After removeElement(40): " + v);

        // 14. removeElementAt(index)
        if (v.size() > 2) {
            v.removeElementAt(2);
        }
        System.out.println("After removeElementAt(): " + v);

        // 15. clear()
        v.clear();
        System.out.println("After clear(): " + v);

        // 16. isEmpty() after clear
        System.out.println("Is Empty now? " + v.isEmpty());
    }
}
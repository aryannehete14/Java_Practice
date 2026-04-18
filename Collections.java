import java.util.LinkedList;

public class Collections{
//     /*public static void main(String[] args){
//         int[] array = {1,2,3,4,5,6,7,8,9,10};
//         for(int i = 0; i < array.length ; i++){
//         System.out.println(array[i]);
//         }
//     }*/

//        /*  public static void main(String[] args) {
//             int[] abc = {1,2,3,4,5,6,7,8,9,10};

//             for(int nums : abc){
//                 System.out.println(nums);
//             }
//         }*/

//         public static void main(String[] args) {
//             String[] cars = {"Audi", "BMW", "Pagani"};
//             for(String car : cars){
//                 System.out.println(car);
//             }
//             System.out.println(cars[cars.length-1]);
//             cars[0] = "Maserati";
//             System.out.println(cars[0]);
//         }


       public static void main(String[] args) {
            LinkedList<String> abc = new LinkedList<>();
            abc.add("Hello");
            abc.add(null);
            abc.add("Am Chaudhary");
            abc.add("Keya");
            abc.add("6969696");
            abc.add(null);
            abc.add(null);

            // for(String str : abc){
            //     System.out.println(str);
            // }

            System.out.println(abc);
            System.out.println(abc.size());
            System.out.println(abc.getFirst());
            System.out.println(abc.getLast());
            System.out.println(abc.getClass());
            System.out.println(abc.isEmpty());
            System.out.println(abc.get(3));



       }

//       public static void main(String[] args) {
//         List<String> abc = new ArrayList<String>();
//         abc.add("Hello");
//         abc.add("69");
//         abc.add("6.66");
//         abc.add(null);
//         abc.add(null);

//         System.out.println(abc);

//         abc.set(0,"Nigger");
//         System.out.println(abc);

//         abc.add(4,"Mritun");
//         System.out.println(abc);

//         // System.out.println(abc.size());
//         // System.out.println(abc.isEmpty());
//         // System.out.println(abc.get(5));

//         for(String inputs : abc){
//             System.out.println(inputs);
//         }
        
//      }
}

// import java.util.*;

// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int[] array = new int[5];
//         System.out.println("Enter the elements of array : ");

//         for (int i = 0; i < array.length; i++) {
//             array[i] = sc.nextInt();
//         }
//         System.out.println("Even numbers are : ");
//         for (int i = 0; i < array.length; i++) {
//             if (array[i] % 2 == 0) {
//                 System.out.println(array[i] + " ");
//             }
//         }

//     }
// }

import java.util.*;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l;

        System.out.println("Enter the length of array :: ");
        l = sc.nextInt();

        int[] arr = new int[l];
        for (int i = 0; i < l; i++)// arr.length
        {
            arr[i] = sc.nextInt();

        }
        System.out.println("Print array :: ");
        System.out.println(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Even number count ::" + count);
    }
}
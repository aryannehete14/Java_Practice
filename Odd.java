import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter elements:");

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array properly
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Apply conditions on each element
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0 && arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                System.out.println(arr[i] + " -> Hello");
            } else if (arr[i] % 2 != 0 && arr[i] % 7 == 0) {
                System.out.println(arr[i] + " -> Hi");
            } else {
                System.out.println(arr[i] + " -> ------------------");
            }
        }
    }
}
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = read.nextInt();

        int[] originalArray = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            originalArray[i] = read.nextInt();
        }

        int[] B = new int[n];

        // Reverse the array using an extra array
        for (int i = 0; i < n; i++) {
            B[i] = originalArray[n - 1 - i];
        }

        System.out.println("Original array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nReversed array:");
        for (int num : B) {
            System.out.print(num + " ");
        }
    }
}

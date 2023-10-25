import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = read.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            array[i] = read.nextInt();
        }

        // Reverse the array using a single loop
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }

        System.out.println("Reversed array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

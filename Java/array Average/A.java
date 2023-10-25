import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the number of elements ");
        int n = read.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements ");

        for (int i = 0; i < n; i++) {
            array[i] = read.nextInt();
        }

        read.close();

        int sum = 0;
        for (int num : array) 
        {
            sum += num;
        }

        double average =  sum / n;
        System.out.println("Average of the elements: " + average);
    }
}

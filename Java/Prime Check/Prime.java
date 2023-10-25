import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = read.nextInt();
        read.close();

        // Check if the entered number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        // Special cases: 0, 1, and negative numbers are not prime
        if (num <= 1) {
            return false;
        }
        
        // Iterate from 2 up to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // If the number is divisible by i, it's not prime
            if (num % i == 0) {
                return false;
            }
        }
        
        // If no divisors were found, the number is prime
        return true;
    }
}

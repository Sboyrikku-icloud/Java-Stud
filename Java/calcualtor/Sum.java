import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner read = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = read.nextInt();
        
        // Close the Scanner after input is taken
        read.close();
        
        // Calculate the sum of digits
        int sum = 0;
        int originalNumber = number; // Store the original number for later comparison
        
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit
        }
        
        // Display the result
        System.out.println("The sum of digits of " + originalNumber + " is " + sum);
    }
}

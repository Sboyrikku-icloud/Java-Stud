import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = read.nextInt();

        read.close();

        // Check if the entered number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        // Reverse the digits of the number
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        // Compare the reversed number with the original number
        return original == reversed;
    }
}

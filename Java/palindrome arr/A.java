import java.util.Scanner;

class A {
    public static void main(String args[]) {
        String original, reverse = ""; // Initialize 'reverse' to an empty string
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter a string: "); // Prompt the user to enter a string
        original = read.nextLine();
        
        int length = original.length(); // Correct the variable name to 'length'
        
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        
        if (original.equals(reverse)) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}

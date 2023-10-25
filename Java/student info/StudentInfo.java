import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        // Create a object to read input from the console
        Scanner obj = new Scanner(System.in);

        // Prompt the user to input the student's name
        System.out.print("Enter student's name: ");
        String name = obj.nextLine();

        // Prompt the user to input the student's age
        System.out.print("Enter student's age: ");
        int age = obj.nextInt();

        // Prompt the user to input the student's roll number
        System.out.print("Enter student's roll: ");
        int roll = obj.nextInt();

        // Close the Scanner to release resources
        obj.close();

        // Print the student's information
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll: " + roll);
    }
}

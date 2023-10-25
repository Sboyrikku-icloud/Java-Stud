public class VariableDifferentiation {
    // Instance variable
    private int instanceVar;

    // Static variable
    private static int staticVar;

    public static void main(String[] args) {
        // Local variable inside the main method
        int localVariable = 10;

        // Creating an instance of the class
        VariableDifferentiation obj = new VariableDifferentiation();

        // Accessing instance variable through the object
        obj.instanceVar = 20;

        // Accessing static variable using class name
        VariableDifferentiation.staticVar = 30;

        // Printing the values
        System.out.println("Instance Variable: " + obj.instanceVar);
        System.out.println("Static Variable: " + VariableDifferentiation.staticVar);
        System.out.println("Local Variable: " + localVariable);
    }
}

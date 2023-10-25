public class A {
    int instanceVar = 10;  // Instance variable

    static int staticVar = 20; // Static variable

    public void method() {

        int localVar = 30; // Local variable

        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
        System.out.println("Local variable: " + localVar);
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.method();
    }
}

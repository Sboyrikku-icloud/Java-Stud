public class A {
    int instanceVar = 10;

    public void method(int instanceVar) {
        this.instanceVar = instanceVar;
        int localVar = 20;

        System.out.println("Inside method:");
        System.out.println("Instance variable: " + this.instanceVar);
        System.out.println("Local variable: " + localVar);
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.method(30);

        System.out.println("Outside method:");
        System.out.println("Instance variable: " + obj.instanceVar);
    }
}

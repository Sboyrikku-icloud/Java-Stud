class A {
    public void Show() {
        System.out.println("This is a non-static method from Class A.");
    }
}

class B {
    public static void main(String[] args) {
        A objA = new A();
        objA.Show(); // Accessing non-static method from Class A
    }
}

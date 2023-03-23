interface InterfaceA {
    int a = 100;

    void foo();
}

class ClassB {
    public void foo() {
        System.out.println("ClassB: foo");
    }
}

public class InterfaceDemo extends ClassB implements InterfaceA {
    public static void main(String[] args) {
        InterfaceA obj = new InterfaceDemo();
        obj.foo(); 
    }
}

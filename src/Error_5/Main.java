package Error_5;

public class Main {
    public static void main(String[] args) {
        A objA = new A();
        B objB = (B) objA;
        objB.print();
    }
}

class A {
    public void print() {
        System.out.println("Class A");
    }
}

class B {
    public void print() {
        System.out.println("Class B");
    }
}
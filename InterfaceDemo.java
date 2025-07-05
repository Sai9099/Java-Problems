interface A {
    int add(int a, int b);
}

interface B {
    int sub(int a, int b);
}

class C implements A, B {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        C obj = new C();

        int sum = obj.add(10, 5);
        int diff = obj.sub(10, 5);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
    }
}

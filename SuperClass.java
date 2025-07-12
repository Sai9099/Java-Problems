class A {
    int a = 10;

    void display() {
        System.out.println(" a = " + a);
    }
}

class B extends A {
    int b = 20;

    void display() {
        super.display(); 
        System.out.println(" b = " + b);
    }
}

class C extends B {
    int c = 30;

    void display() {
        super.display();  
        System.out.println(" C: c = " + c);
    }
}

class SuperClass {
    public static void main(String args[]) {
        C obj = new C(); 
        obj.display();  
      
    }
}

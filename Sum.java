class A {
    int a;

    A() {  
        a = 10;
    }
}

class B extends A {
    int b;

    B() {  
        super();  
        b = 20;
    }
}

class C extends B {
    int c;

    C() {  
        super();  
        c = 30;
    }

    void display() {
        System.out.println("a = " + super.a);  
        System.out.println("b = " + super.b);  
        System.out.println("c = " + c); 
	}
}
class SuperClass
{
public static void main("String args[]){
  C c= new C();
c.display();
}
}
	

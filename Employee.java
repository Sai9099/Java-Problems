package mypack;

public class Employee {
    String name;
    double bs, Hra, da, ta;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + bs);
        System.out.println("HRA: " + Hra);
        System.out.println("DA: " + da);
        System.out.println("TA: " + ta);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "David Miller";
        emp.bs = 55000;
        emp.Hra = 11000;
        emp.da = 6000;
        emp.ta = 3500;

        emp.display();
    }
}

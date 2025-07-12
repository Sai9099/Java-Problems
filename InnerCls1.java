class Parent {
	class A{
		public void displayInfo(){
		System.out.println("I am A");
	}
}
static class B{
	public void displayInfo(){
		System.out.println("I am B");
	}
}
}
class InnerCls1{
	public static void main(String args[])
	{
		Parent parent = new Parent();
		Parent.A a = parent.new A();
		a.displayInfo();
		Parent.B b = new Parent.B();
		b.displayInfo();
		
	}
}


class add
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	double add(double a,double b);
	{
		return a+b;
	}
}
	
class Demo
{
	public static void main(String args[])
	{
		calc ob = new calc();
		ob.add(10,20,30);
		ob.add(20,40);
		System.out.println(ob.add(20.34, 44.34));
	}
}
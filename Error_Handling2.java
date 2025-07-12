class Error_Handling {
    public static void main(String args[]) {
        int a[] = {5, 10};
        int b = 10;
    
        try {
            int x = a[2] / b - a[1];
        } 
        catch (ArithmeticException e) 
		{
            System.out.println("Divided by zero");
        } 
        catch (ArrayIndexOutOfBoundsException e)
		{ 
            System.out.println("Array index Error");
        } 
        catch (ArrayStoreException e)
		{
            System.out.println("Wrong data type");
        }

        int y = a[1] / a[0]; 
        System.out.println("Y=" + y);
    }
}

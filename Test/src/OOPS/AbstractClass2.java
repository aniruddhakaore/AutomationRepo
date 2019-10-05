package OOPS;

public class AbstractClass2 extends AbstractClass1{
	
	public void method2()
	{
		System.out.println("I am method2");
	}
	
	
	public static void main(String args[])
	{
		// AbstractClass1 ab = new AbstractClass1(); // Error because abstract class can not be intansiated
		AbstractClass1 ab = new AbstractClass2();
		ab.method2();
		ab.method1();
	}
	
	

}

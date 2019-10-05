package OOPS;


public class Interfaceimplementation implements IterfaceExample {
	
	
	
	public void method1()
	{
		System.out.println("Test 1 method");
	}
	
	public void method2()
	{
		System.out.println("Test 2 method");
	}
	
	
	public static void main ( String args[])
	{
		IterfaceExample i = new Interfaceimplementation();
		// a =20; // Error because value of final variable can not be changed
		System.out.println(IterfaceExample.a);
		i.method1();
		i.method2();
	}

}

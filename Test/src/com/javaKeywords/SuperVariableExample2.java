package com.javaKeywords;

public class SuperVariableExample2 extends SuperVariableExample1{
	
	String var1 = "MY Name is Rajkumar Telkar";
	
	void method1(){System.out.println("calling method...");
	
	super.method1();
}
	
	void prntmsg(){  
		System.out.println(var1);
		System.out.println(super.var1);
		
		
		
		}  
	
	
	public static void main(String args[])
	{
		SuperVariableExample2 su2 = new SuperVariableExample2();
	    su2.prntmsg();
	    su2.method1();
	    
	}

}

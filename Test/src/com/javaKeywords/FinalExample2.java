package com.javaKeywords;

public class FinalExample2 extends FinalMethod1Example{
	
	void finalexampl()
	{
		System.out.println("I want to override");
	}
	
	public static void main(String args[])
	{
		FinalExample2 fn = new FinalExample2();
		fn.finalexampl();
	}

}

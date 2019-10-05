package com.javaKeywords;

public class SuperclassConstructorExample2 extends SuperclassConstructorExample1{
	
	SuperclassConstructorExample2()
	{
		super();
		System.out.println("Child Class Constructor");
	}

	public static void main(String[] args) {

		SuperclassConstructorExample2 swa2 = new SuperclassConstructorExample2();

	}

}

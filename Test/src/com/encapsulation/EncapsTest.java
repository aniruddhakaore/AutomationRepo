package com.encapsulation;

public class EncapsTest{
    public static void main(String args[]){
    	Encapsulation1 obj = new Encapsulation1();
        obj.setEmpName("John");
        obj.setEmpAge(36);
        obj.setEmpSSN(112233);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getEmpSSN());
        System.out.println("Employee Age: " + obj.getEmpAge());
   } 
}
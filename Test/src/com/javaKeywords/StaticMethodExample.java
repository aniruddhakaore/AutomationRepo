package com.javaKeywords;

public class StaticMethodExample {
	
	 int rollno;  
     String name;  
     static String college = "OIST";  
       
     static void change(){  
     college = "LNCT";  
     }  
  
     StaticMethodExample(int r, String n){  
     rollno = r;  
     name = n;  
     }  
  
     void display (){System.out.println(rollno+" "+name+" "+college);}  
  
    public static void main(String args[]){  
    	StaticMethodExample.change();  
  
    StaticMethodExample s1 = new StaticMethodExample (111,"Rajkumar");  
    StaticMethodExample s2 = new StaticMethodExample (222,"Arun");  
    StaticMethodExample s3 = new StaticMethodExample (333,"Anand");  
  
    s1.display();  
    s2.display();  
    s3.display();  
    }  
}  



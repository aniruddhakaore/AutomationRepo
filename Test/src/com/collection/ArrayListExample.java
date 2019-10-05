package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
	 public static void main(String args[]){  
		  ArrayList<String> list=new ArrayList<String>(); 
		  list.add("Rajkumar");  
		  list.add("Anand");  
		  list.add("Nihansh");  
		  list.add("Suraj");  
		  //Traversing list through Iterator  
		  Iterator<String> itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		   
		   // traversing through for each loop   
		   for(String obj:list)  
			    System.out.println(obj); 
		  }  
		 }  

}

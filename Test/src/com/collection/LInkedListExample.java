package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LInkedListExample {
	
	public static void main(String args[]){  
		  
		  LinkedList<String> al=new LinkedList<String>();  
		  al.add("Sanjay");  
		  al.add("raj");  
		  al.add("RRanbeer");  
		  al.add("suraj");  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  

}

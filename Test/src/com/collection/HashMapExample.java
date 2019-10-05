package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	
	public static void main(String args[])
	   {
	       Map< String,Integer> hm = 
	                        new HashMap< String,Integer>();
	       hm.put("wagholi", new Integer(412207));
	       hm.put("Khradi", new Integer(411014));
	       hm.put("Hinjewadi", new Integer(411057));
	       hm.put("VimanNagar", new Integer(411014));
	 
	       // Returns Set view     
	       Set< Map.Entry< String,Integer> > st = hm.entrySet();   
	 
	       for (Map.Entry< String,Integer> me:st)
	       {
	           System.out.print(me.getKey()+":");
	           System.out.println(me.getValue());
	       }
	   }

}

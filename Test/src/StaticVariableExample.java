
public class StaticVariableExample {
	
	 int id;  
	   String name;  
	   static String Company ="CTS";  
	     
	   StaticVariableExample(int r,String n){  
	   id = r;  
	   name = n;  

}
	   
	   void display (){System.out.println(id+" "+name+" "+Company);} 
	   
	   public static void main(String args[]){  
		   StaticVariableExample s1 = new StaticVariableExample(305313,"Rajkumar");  
		   StaticVariableExample s2 = new StaticVariableExample(305414,"Anand");  
		     
		   s1.display();  
		   s2.display();  
		   }  
		  } 

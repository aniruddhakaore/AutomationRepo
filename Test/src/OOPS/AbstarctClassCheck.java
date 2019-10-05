package OOPS;

 class AbstarctClassCheck {
	
	public static void main(String args[])
	{
		Bank b = new SBI();
		System.out.println("Roi is = "+b.ROI());
		
		Bank c = new ICICI();
		System.out.println("Roi is = "+c.ROI());
		
		
	}

}

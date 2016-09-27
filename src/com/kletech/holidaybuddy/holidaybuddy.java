package com.kletech.holidaybuddy;

interface TravelAgency
	{
		 
		 
		double onlyTravel(Customer c ,boolean visiting ,double amt);
		
		double TravelWithFoodBed(Customer c, boolean visiting, double amt);
		double holidayPackage(double amt,Customer c, boolean visiting);
}
	 
	 class Holidaybuddy implements TravelAgency
	 {		
			
		 
		 	
		public 	double TravelWithFoodBed(Customer c, boolean visiting, double amt)
		 	{
		 		
		 		
		 		if(c.bfemale && visiting)
		 			
		 		{
		 			amt=amt-amt*0.12;
		 			System.out.println(" 12% discount given");
		 			return amt;
		 			
		 			
		 		}
		 		else if(c.bfemale )
		 		{
		 			amt=amt-amt*0.02;
		 			System.out.println(" 2% discount given");
		 			return amt;
		 		}
		 		
		 		else if(!c.bfemale&& visiting)
		 		{
		 			amt=amt-amt*0.1;
		 			System.out.println(" 10% discount given");
		 			return amt;
		 		}
		 		else
		 		{System.out.println(" no discount given");
		 			return amt;
		 		}
		 		
		 		
		 	}
		 	
		public	double holidayPackage(double amt,Customer c, boolean visiting)
			{
				
				if(c.bfemale && visiting)
		 			
		 		{
		 			amt=amt-amt*0.12;
		 			System.out.println(" 12% discount given");
		 			return amt;
		 			
		 			
		 		}
		 		else if(c.bfemale )
		 		{
		 			amt=amt-amt*0.02;
		 			System.out.println(" 2% discount given");
		 			return amt;
		 		}
		 		
		 		else if(!c.bfemale&& visiting)
		 		{
		 			amt=amt-amt*0.1;
		 			System.out.println(" 10% discount given");
		 			return amt;
		 		}
		 		else
		 		{System.out.println(" no discount given");
		 			return amt;
		 		}
			}
			 
	public		double onlyTravel(Customer c , boolean visiting ,double amt)
			{

				if(c.bfemale && visiting)
		 			
		 		{
		 			amt=amt-amt*0.12;
		 			System.out.println(" 12% discount given");
		 			
		 			return amt;
		 			
		 		}
		 		else if(c.bfemale )
		 		{
		 			amt=amt-amt*0.02;System.out.println(" 2% discount given");
		 			return amt;
		 		}
		 		
		 		else if(!c.bfemale&& visiting)
		 		{
		 			amt=amt-amt*0.1;
		 			System.out.println(" 10% discount given");
		 			return amt;
		 		}
		 		else
		 	{
		 		System.out.println(" no discount given");
		 		return amt;
		 	}
		}
	 }
	 
class Customer
	 {
	 	
	 	String sName;
	 	long Phoneno;
	 	boolean bfemale;
	 	String Place;
	 	int i;
	 	public Customer(String sName, long phoneno, boolean bfemale,String Place,int i) {
	 	super();
	 	this.sName = sName;
	 	Phoneno = phoneno;
	 	this.bfemale=bfemale;
	 	this.Place=Place;
	 	this.i=i;
	}
}

package com.kletech.holidaybuddy;

public class holidaybuddydemo {
	public static void main(String[] args) {
		int i=0;
		Holidaybuddy h=new Holidaybuddy();
		Customer[] c=new Customer[3];
		c[0]=new Customer("spoo", 9738340336l, true, "mysore",1);
		c[1]=new Customer("shrr", 9738340338l, false, "banglore",2);
		c[2]=new Customer("triveni",9448338616l,true, "banglore",3);
		for(i=0;i<c.length;i++)
		{
			System.out.println(" name of customer "+c[i].sName +" with phone no "+c[i].Phoneno );
			
			System.out.println(" want to travel"+c[i].Place);
			
			if(c[i].i==1)
			{	
		System.out.println("package amount =" +h.holidayPackage(8000d, c[i], true));
			}
			else if(c[i].i==2)
			{
		System.out.println("package amount =" +h.TravelWithFoodBed(c[i], false, 9000d));
			}
			else
		System.out.println("package amount =" +h.onlyTravel(c[i], true, 6000d));
		}
	}
}

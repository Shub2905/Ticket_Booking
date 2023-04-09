package com.java.Bus;

import java.util.Scanner;



public class Welcome
{public static void main(String[] args) 
{
	   Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Ticket Booking System");
		System.out.println("Please Select your Current Location");
		
		System.out.println("1.Aurangabad");
		int C_L=sc.nextInt();
		System.out.println("Please Select Your Destination");
		System.out.println("1.Pune (Base fare 230)");
		System.out.println("2.Nagar(Base fare 280)");
		System.out.println("3.Mumbai(Base fare 330)");
		int Des=sc.nextInt();
		Fare obj =new Fare();
		Mumbai obj1=new Mumbai();
		Nagar obj2 =new Nagar();
//		/sc.close();
		
		if(Des==1)
		{
			obj.Pune_fare();
			
		}
		else if (Des==2)
		{
			obj2.Nagar_fare();
		}
		else if (Des==3)
		{
			obj1.Mumbai_fare();
		}
		else
		{
			System.out.println("Invalid Selection");
		}
		
		System.out.println();
		

}
	
	



}

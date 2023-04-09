package com.java.Bus;

import java.util.Scanner;

public class Nagar {
	int S1;
	int S2;
public void Nagar_fare()
{
	Scanner sc = new Scanner(System.in);
	int f1=280;
	System.out.println("Please Select Your Bus");
	System.out.println("1.Shivshai (Addon fare=130)");
	System.out.println("2.MSRTC (Addon fare=75)");
	System.out.println("3.Humsafar  (Addon fare=105)");
	int f2=sc.nextInt();
	
	{
		
	if(f2==1)
	{   this.S1=130;
		
	}
	if(f2==2)
	{
		this.S1=75;
	}
	if(f2==3)
	{
		this.S1=105;
	
	}
	System.out.println("Please Select Seat type");
	System.out.println("1.Sleeper (Addon fare=150) ");
	System.out.println("2.Genral (Addon fare=35)");
	System.out.println("3.AC (Addon fare=140)");
	int S_type =sc.nextInt();
	if(S_type==1)
	{
		this.S2=150;
	}
	if(S_type==2)
	{
		this.S2=35;
	}
	if(S_type==3)
	{
		this.S2=140;
		
	}
	
	int Total_Fare = f1+S1+S2;
	
	System.out.println("How Many Tickets you want");
	int T1 =sc.nextInt();
	int T11=T1*Total_Fare;
//	sc.close();
	
	
	System.out.println("Your single Ticket Amount is = "+Total_Fare);
	System.out.println("Your "+T1+" Ticket Amount is = "+T11);
	
	
	}	
}
	
}




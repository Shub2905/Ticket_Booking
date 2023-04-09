package com.java.Bus;

import java.util.Scanner;

public class Fare extends Welcome
{
	int S1;
	int S2;
public void Pune_fare()
{
	Scanner sc = new Scanner(System.in);
	int f1=230;
	System.out.println("Please Select Your Bus");
	System.out.println("1.Shivshai (Addon fare=100)");
	System.out.println("2.MSRTC (Addon fare=50)");
	System.out.println("3.Humsafar  (Addon fare=80)");
	int f2=sc.nextInt();
	{
		
	if(f2==1)
	{   this.S1=100;
		
	}
	if(f2==2)
	{
		this.S1=50;
	}
	if(f2==3)
	{
		this.S1=80;
	
	}
	System.out.println("Please Select Seat type");
	System.out.println("1.Sleeper (Addon fare=150) ");
	System.out.println("2.Genral (Addon fare=25)");
	System.out.println("3.AC (Addon fare=120)");
	int S_type =sc.nextInt();
	if(S_type==1)
	{
		this.S2=150;
	}
	if(S_type==2)
	{
		this.S2=25;
	}
	if(S_type==3)
	{
		this.S2=120;
		
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




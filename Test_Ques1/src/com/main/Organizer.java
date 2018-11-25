package com.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import com.model.ReserveException;
import com.model.Ticket;

public class Organizer 
{
	static Scanner sc= new Scanner(System.in);
	static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	static Booking b=new Booking();
	public static void dispMenu() 
	{
		System.out.println("*****Ticket Management System******");
		System.out.println("1. ReserveTicket ");
		System.out.println("2. DisplayAudiences ");
		
	}
	
	

	public static void main(String args[]) throws ParseException, ReserveException 
	{
		String ans = "";
		do
		{
			dispMenu();
			System.out.println("Enter your choice ");
			int ch =sc.nextInt();
			switch (ch) 
			{
				case 1:
					System.out.println("Enter the Details to book Ticket");
					System.out.println("Enter the ticketId");
					int id=sc.nextInt();
					
					System.out.println("Enter the audienceName");
					String name=sc.next();
					
					System.out.println("Enter the nationality either indians or foreigners");
					String nation=sc.next();
					
					System.out.println("Enter the age");
					int age=sc.nextInt();
					if(age<18)
					{
						throw new ReserveException("Age should  be more than 18 years");  //exception thrown explicitly
					}
					
					System.out.println("Enter the cellnumber");
					String number=sc.next();

					if(number.length()>10)  // number should not be more than 10 digits
					{
						throw new ReserveException("cell number should be of 10 digits");  //exception thrown explicitly
					}
					
					System.out.println("Enter the date");
					String date=sc.next();
					
					
					
					Ticket t=new Ticket(id,name,nation,age,number, dateFormat.parse(date));
					// calling method booking class
					b.reserveTicket(t);
					
					System.out.println("Your Ticket Successfully Generated");
					System.out.println("Please Pay RS."+Booking.ticket_price+" "+"Ticket Id is "+id);
					
					break;
				case 2:
					// calling method booking class
					b.displayAudiences() ;
					break;
			}
			System.out.println("Do you want to continue yes/no?");
			ans =sc.next();
		} while (ans.equalsIgnoreCase("yes"));
	}
}

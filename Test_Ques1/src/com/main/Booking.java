package com.main;

import java.util.ArrayList;

import com.model.Game;
import com.model.ReserveException;
import com.model.Ticket;

public class Booking implements Game
{
	public static int ticket_price = 0;
	int flag=0;
	public static ArrayList<Ticket>ticketList=new ArrayList<>();
	@Override
	public void reserveTicket(Ticket ticket) throws ReserveException 
	{
		flag++;
		if(flag>100)
		{
			throw new ReserveException("Tickets already sold");
		}
		
		else
		{
		if(ticket.getNationality().equalsIgnoreCase("Indians"))
		{
			 ticket_price=500;
		}
		
		if(ticket.getNationality().equalsIgnoreCase("foreigners"))
		{
			 ticket_price=1000;
		}
		Ticket tt=new Ticket(ticket.getId(),ticket.getAudienceName(),ticket.getNationality(),ticket.getAge(),ticket.getCellNo(),ticket.getReserveDate());
		ticketList.add(tt);
		}
	}

	@Override
	public void displayAudiences() 
	{
		for(Ticket tList:ticketList)
		{
			System.out.println(tList.toString());
		}
		
	}
	
}

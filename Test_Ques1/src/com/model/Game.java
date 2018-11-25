package com.model;

public interface Game        //contracts designed
{
	public void reserveTicket(Ticket ticket) throws ReserveException;
	public void displayAudiences();
}

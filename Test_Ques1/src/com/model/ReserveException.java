package com.model;

public class ReserveException extends Exception    //exception class generated
{
	public ReserveException(String s)
	{
		super(s);
		System.out.println(s);
	}
}

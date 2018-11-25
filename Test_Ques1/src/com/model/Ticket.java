package com.model;

import java.util.Date;

public class Ticket      
{
	int id;
	String audienceName;
	public String nationality;
	int age;
	String cellNo;
	Date reserveDate;
	
	public Ticket(int id, String audienceName, String nationality, int age, String cellNo, Date reserveDate) {
		super();
		this.id = id;
		this.audienceName = audienceName;
		this.nationality = nationality;
		this.age = age;
		this.cellNo = cellNo;
		this.reserveDate = reserveDate;
	}


	public Ticket()
	{
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAudienceName() {
		return audienceName;
	}
	public void setAudienceName(String audienceName) {
		this.audienceName = audienceName;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCellNo() {
		return cellNo;
	}
	public void setCellNo(String cellNo) {
		this.cellNo = cellNo;
	}
	public Date getReserveDate() {
		return reserveDate;
	}
	public void setReserveDate(Date reserveDate) {
		this.reserveDate = reserveDate;
	}


	@Override
	public String toString() {
		return "Ticket [id=" + id + ", audienceName=" + audienceName + ", nationality=" + nationality + ", age=" + age
				+ ", cellNo=" + cellNo + ", reserveDate=" + reserveDate + "]";
	}
	
	
	
	
}

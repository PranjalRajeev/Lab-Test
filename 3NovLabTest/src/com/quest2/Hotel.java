package com.quest2;

public class Hotel {
	
	//instance variables
	private int roomNumber;
	private String roomType;
	private String ac;
	private int roomArea;
	private int roomPrice;
	
	//default constructor
	public Hotel() {
		super();
		
	}
	
	//parameterised constructor
	public Hotel(int roomArea) {
		
		this.roomArea = roomArea;
	}
	
	
	//Parameterised constructor
	public Hotel(int roomNumber, String roomType, String ac, int roomArea, int roomPrice) {
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.ac = ac;
		this.roomArea = roomArea;
		this.roomPrice = roomPrice;
	}

	public int getRoomArea() {
		return roomArea;
	}

	public void setRoomArea(int roomArea) {
		this.roomArea = roomArea;
		
	}
	
	
	
	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String isAc() {
		return ac;
	}

	public void setAc(String ac) {
		this.ac = ac;
	}

	public int getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}

	//Pay the price method
	int paytherpice(int roomrice)
	{
		return roomPrice;
	}
	
	//Pay the price method with different arguments.
	int paytheprice(int roomPrice, int discount)
	{
		return roomPrice = roomPrice - (roomPrice*discount)/100;
	}
	
	
	
	
	
	

}

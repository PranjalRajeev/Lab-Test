package com.quest2;

import java.util.Scanner;

public class HotelTest {
	
	static void menu()
	{
		System.out.println(".....WELCOME TO VRINDHAM GRAND HOTELS.....");
		System.out.println("1. Select room type");
		System.out.println("2. AC Required?");
		System.out.println("3. Select Room Area");
		
	}
	
	public static void main(String args[])
	{
		menu();
		int choice, roomarea;
		String roomtype="";
		String ac="";
		Scanner sc= new Scanner(System.in);
		Hotel c1= new Hotel();
		
		choice = sc.nextInt();
		
		//starting of switch case
				switch(choice)
				{
				case 1: System.out.println(" Select room type");
					System.out.println("1. Delux");
				System.out.println("2. Super Delux");
				System.out.println("3. Suit");
				roomtype = sc.next().toUpperCase();
				c1.setRoomType(roomtype);
				
				case 2: System.out.println(" AC Required?");
					System.out.println("Yes");
				System.out.println("No");
				ac = sc.next().toLowerCase();
				c1.setAc(ac);
				
				case 3: System.out.println(" Select Room Area");
					System.out.println("1. 200 Sqft");
				System.out.println("2. 300 Sqft");
				System.out.println("3. 500 Sqft");
				roomarea = sc.nextInt();
				c1.setRoomArea(roomarea);
				break;
				default:
					System.out.println("Invalid Input....");
				}
				
				
		if(ac == "yes" && roomtype =="suit")
		{
			c1.setRoomPrice(3500);
		}
		else if(ac == "yes" && roomtype == "super delux")
		{
			c1.setRoomPrice(2500);
		}
		else if(ac == "no" && roomtype == "delux")
		{
			c1.setRoomPrice(1500);
		}
		else
		{
			c1.setRoomPrice(1250);
		}
		
		System.out.println("--------------------------------");
		System.out.println("	Room Type -"+c1.getRoomType());
		System.out.println("	AC Required -"+c1.isAc());
		System.out.println("	Room Area -"+c1.getRoomArea());
		System.out.println("	Room Price -"+c1.getRoomPrice());
		System.out.println("	Room Number -"+c1.getRoomNumber());
		System.out.println("--------------------------------");
	}

}

/* Question 1: Piggie Bank
 @Author: Pranjal Rajeev
 @Date: 3 Nov 2022
 */

//Package
package com.quest3;

//importing scanner
import java.util.Scanner;

//creating class
public class PiggieBank {


	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("WELCOME TO YOUR PIGGIE BANK");
		
		POJO c1 = new POJO();
		//POJO c2 = new POJO(200,50);
		c1.setAmount(50);
		//c2.setAmount(100);
		
		int addamt;
		
		int choice;
		do
		{
		System.out.println("Do you want to add more: ");
		choice = sc.nextInt();
		
		
		System.out.println("Enter the amount: ");
			addamt = sc.nextInt();
			c1.setAddamt(addamt);
			System.out.println("AMOUNT ADDED SUCCESSFULLY");
			System.out.println("Your Total Amount is: "+c1.getAddamt());
			System.out.println("---------------------------");
		}while(choice == 1); //end of do while
		sc.close();

	}//end of main

}//end of class

/*Q1.
@Author: Pranjal Rajeev
@Date: 20.10.22*/

//Importing packages
import java.util.Scanner;

//Creating class
class Discount
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantity of Diwali Lights you want: ");
		int qty = sc.nextInt();//taking input
	
		int total = 540*qty;//total bill
		System.out.println("Your bill amount is = "+total);
		
		//if else
		if(total>=2000)
		{
			int bill = total-(total*10)/100;
			System.out.println("Bill after 10% Discount is: "+bill);
		}
		else
		{
			System.out.println("Thanks for shopping...");
		}
	}
}
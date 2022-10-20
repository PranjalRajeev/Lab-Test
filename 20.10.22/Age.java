/*Q2.
@Author: Pranjal Rajeev
@Date: 20.10.22*/

//Impoting Packages
import java.util.Scanner;

class Age//Class
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		//Taking Input
		System.out.println("Input 3 ages: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		//If else Ladder
		if(a>b&&a>c)
		{
			System.out.println("Oldest one is "+a);
		}
		else if(b>a&&b>c)
		{
			System.out.println("Oldest one is "+b);
		}
		else if(c>b&&c>a)
		{
			System.out.println("Oldest one is "+c);
		}
		else if(a<b&&a<c)
			System.out.println("Youngest is "+a);
		else if(b<a&&b<c)
			System.out.println("Youngest is "+b);
		else
			System.out.println("Youngest is "+c);
		
		
	}
	
}
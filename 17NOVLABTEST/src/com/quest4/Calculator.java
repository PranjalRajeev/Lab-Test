package com.quest4;

public class Calculator {
	

	
	
		//method for addition
		public static float addition(float num1, float num2)
		{
			return num1+num2;
		}
		
		//method for substraction
		public static float substraction(float num1, float num2)
		{
			return num1-num2;
		}
		
		//method for multiplication
		public static float multiplication(float num1, float num2)
		{
			return num1*num2;
		}
		
		//method for division
		public static float division(float num1, float num2)
		{
			float c =num1/num2;
			try {float c;}
			catch(ArithmeticException e){
				System.out.println(e.getMessage());
				
			}
			return c;
			
		}
	


}

package com.foxmula.assignment3;
import java.util.*;

public class CustomException {
	
	public static void main(String Args[])
	{
	int number;
	boolean isPrime = true;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	number = sc.nextInt();
	
	try
	{
		
			for(int i=2;i<number && isPrime;i++)
			{
				if(number%i==0)
				isPrime = false;
				
			}
			
			if(isPrime && number%2==1)
			{
				throw new ArithmeticException("Number is Invalid"); 
			}
			else System.out.println("ABc");
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	finally
	{
		sc.close();
	}
	}
	}



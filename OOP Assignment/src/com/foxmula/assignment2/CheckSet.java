package com.foxmula.assignment2;
import java.util.*;


public class CheckSet {
	protected static HashSet<String> newSet = new HashSet<String>();
	public static void exists(String elementToFind)
	{
	
		if(newSet.contains(elementToFind))
		{
			System.out.println("Element Exists");
			
		}
		else
			System.out.println("Element Doesn't Exists");
	}
	public static void main()
	{
		String elementToAdd,elementToCheck;
		Scanner sc = new Scanner(System.in);
		boolean quit = false;
		int value;
		while(!quit)
		{
		System.out.println(" Enter 1 to add Element ");
		System.out.println(" Enter 2 to check if the Element exists");
		System.out.println(" Enter 3 to quit ");
		value = sc.nextInt();
		sc.nextLine();
		switch(value)
		{
		case 1:
			elementToAdd = sc.nextLine();
		   newSet.add(elementToAdd);
		   break;
		case 2:
			elementToCheck = sc.nextLine();
			exists(elementToCheck);
			break;
		case 3:
			quit = true;
			break;
		
		}
		}
	}


}

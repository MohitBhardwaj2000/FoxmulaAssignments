package com.foxmula.assignment2;
import java.util.*;
import java.util.ArrayList;

public class CheckArrayList {
	protected static ArrayList<String> newArrayList = new ArrayList<String>();
	public static void exists(String elementToFind)
	{
		
		if(newArrayList.contains(elementToFind))
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
		   newArrayList.add(elementToAdd);
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

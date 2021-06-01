package com.foxmula.assignment2;


import java.util.*;
import java.util.TreeSet;
import java.util.Scanner;

public class TraverseTreeSet {
	public static void main()
	{
		TreeSet<String> newSet = new TreeSet<String>();
		Scanner sc = new Scanner(System.in);
		String elementToAdd;
		boolean quit = false;
		int value;
		while(!quit)
		{
		System.out.println(" Enter 1 to add Element ");
		System.out.println(" Enter 2 to Traverse");
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
			Iterator<String> traverse = newSet.iterator();
			while(traverse.hasNext())
			{
				System.out.println(traverse.next());
			}
			break;
		case 3:
			quit = true;
			break;
		
		}
		}
		
	}

}

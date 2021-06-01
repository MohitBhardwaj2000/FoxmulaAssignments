package com.foxmula.assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class KSum {
	protected static ArrayList<Integer> newArrayList = new ArrayList<Integer>(); 
	
	public static void kSum(int sum)
    {
        // consider each element except the last
        for (int i = 0; i <newArrayList.size() - 1; i++)
        {
            // start from the i'th element until the last element
            for (int j = i + 1; j < newArrayList.size(); j++)
            {
                // if the desired sum is found, print it
                if (newArrayList.get(i) + newArrayList.get(j) == sum)
                {
                    System.out.println("Pair found (" + newArrayList.get(i) + ", " + newArrayList.get(j) + ")");
                    return;
                }
            }
        }
 
        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }
	public static void main()
	{
		int elementToAdd,k;
		Scanner sc = new Scanner(System.in);
		boolean quit = false;
		int value;
		while(!quit)
		{
		System.out.println(" Enter 1 to add Element ");
		System.out.println(" Enter 2 for K sum");
		System.out.println(" Enter 3 to quit ");
		value = sc.nextInt();
		sc.nextLine();
		switch(value)
		{
		case 1:
			elementToAdd = sc.nextInt();
			sc.nextLine();
		   newArrayList.add(elementToAdd);
		   break;
		case 2:
			k = sc.nextInt();
			kSum(k);
			break;
		case 3:
			quit = true;
			break;
		

}
}
	}
}

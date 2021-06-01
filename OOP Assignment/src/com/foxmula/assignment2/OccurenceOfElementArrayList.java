package com.foxmula.assignment2;



import java.util.ArrayList;
import java.util.Scanner;


public class OccurenceOfElementArrayList 
{		
		protected static ArrayList<String> newArrayList = new ArrayList<String>();
		
		
		
		public static void occurenceOfElements()
		{
			//Array fr will store frequencies of element  
			
			int [] frequency = new int [newArrayList.size()];   
			int visited = -1, count = 1; 
	        
	        for(int i = 0; i < newArrayList.size(); i++)
	        {   
	            for(int j = i+1; j < newArrayList.size(); j++)
	            {  
	                if(newArrayList.get(i) == newArrayList.get(j))
	                {  
	                    count++;  
	                    //To avoid counting same element again  
	                    frequency[j] = visited;  
	                }  
	            } 
	            
	            if(frequency[i] != visited)  
				{
	            	frequency[i] = count;  
				}
	        }  
			//Displays the frequency of each element present in array  
	       
	        //System.out.println(" Element | Frequency");  
	        //System.out.println("---------------------------------------"); 
	        
	        for(int i = 0; i < frequency.length; i++)
	        {  
	            if(frequency[i] != visited)  
				{
	                System.out.println(newArrayList.get(i) + " is" + frequency[i]+" times"); 
				}					
	        } 
		}
	        
	    public static void main()
	    {
	    	
	    	String elementToAdd;
			Scanner sc = new Scanner(System.in);
			boolean quit = false;
			int value;
			while(!quit)
			{
			System.out.println(" Enter 1 to add Element ");
			System.out.println(" Enter 2 to Occurance of Element exists");
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
			
				occurenceOfElements();
				break;
			case 3:
				quit = true;
				break;
			
	    }
	        
		}
			
	    }
}
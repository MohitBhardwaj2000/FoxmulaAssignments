package com.foxmula.assignment3;
import java.util.*;
import java.util.Map.Entry;

public class SortedOccurance {

	static void occurance(int arr[])
    {
  
        HashMap<Integer, Integer> Hmap =
                     new HashMap<Integer, Integer>();
  
        for (int i = 0; i < arr.length; i++)
        {
            Integer count = Hmap.get(arr[i]);
  
            if (Hmap.get(arr[i]) == null)
               Hmap.put(arr[i], 1);
            else
              Hmap.put(arr[i], ++count);
        }
        
        
        ArrayList<Entry<Integer, Integer>> list=new ArrayList<Entry<Integer, Integer>>(Hmap.entrySet());
        Collections.sort(list, new Comparator<Entry<Integer, Integer>>(){
		
			public int compare(Entry<Integer, Integer> object1, Entry<Integer, Integer> object2) {
				return object1.getValue().compareTo(object2.getValue());
			}
			
		});
		
		System.out.println(list);
	      
	     
	}
        
        
       
    public static void main (String[] args)
    {
        int arr[] = {10, 34, 5, 10, 3, 5, 10};
        occurance(arr);
    }
}

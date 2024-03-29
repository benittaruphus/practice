package com.ben.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestConsecutive {

	
	void find(List<Integer> numbers)
	{
		Integer key=0, next = 0, count = 1;
		Integer value = 1;
		Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer> ();
		Integer start =numbers.get(0);
		numbersMap.put(start, 1);
		for(int i=1; i<numbers.size(); i++)
		{
			Integer num =numbers.get(i);
			next=num;
			if(!numbersMap.containsKey(num))
			{
				numbersMap.put(num, 1);
				count=1;
				start=num;
			}
			else if(next==start)
			{
				count++; 
				
				if(count>value)
				{
					key=num;
					value=count;
					numbersMap.put(num, count);
				}
			}
			else
			{
				count=1;
				start=num;
			}
			
		}
		System.out.println(key+" "+value);
		
	}
	
	public static void main(String[] args)
	{
		LongestConsecutive l = new LongestConsecutive();
		List<Integer> numbers = new ArrayList<Integer>();
		numbers = Arrays.asList(1,2,2,2,2,2,1,3,3,1,4,4,1,2,2,2,4,4,4,4);
		l.find(numbers);
		
	}
}

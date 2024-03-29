package com.ben.practice;

import java.util.Set;
import java.util.TreeSet;
public class ThreeFiveMultiples {

	Set<Integer> multiples(int m)
	{
		Set<Integer> multiples = new TreeSet<>();
		
		for(int k=3; k<m; k++)
		{
			multiples.add(k%3==0?k:0);
			multiples.add(k%5==0?k:0);
		}
		System.out.println(multiples);
		return multiples;
	}
	
	Long sumOfMultiples(int m)
	{
		Set<Integer> multiples = multiples(m);
		Long sum=0L;
		for(Integer i:multiples)
		{
			sum=sum+i;
		}
		return sum;
	}
	
	public static void main (String [] args)
	{
		ThreeFiveMultiples t = new ThreeFiveMultiples();
		System.out.println(t.sumOfMultiples(1000));
		
	}
}


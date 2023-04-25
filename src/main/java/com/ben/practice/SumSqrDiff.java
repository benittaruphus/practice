package com.ben.practice;

public class SumSqrDiff {
	
	int findSumSqrDiff(int n)
	{
		int sumOfSqrs=0;
		int sum = 0;
		int sqrOfSum=0;
		int diff=0;
		
		for(int i=1; i<=n; i++)
		{
			int sqr = i*i;
			sumOfSqrs +=sqr;
		}
		
		for(int i=1; i<=n; i++)
		{
			sum +=i;
		}
		sqrOfSum = sum*sum;
		
		diff = sqrOfSum - sumOfSqrs;
		
		return diff;
	}
	
	public static void main(String[] args)
	{
		SumSqrDiff s = new SumSqrDiff();
		System.out.println(s.findSumSqrDiff(100));
		
	}

}

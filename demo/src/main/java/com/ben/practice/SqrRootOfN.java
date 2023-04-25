package com.ben.practice;

public class SqrRootOfN {

	int findSqrRoot(int n)
	{
		int sqrRoot = 0;
		
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0&&n/i==i)
			{
				return i;
			}
		}
		
		
		return sqrRoot;
	}
	
	
	
	public static void main(String[] args)
	{
		SqrRootOfN s = new SqrRootOfN();
		
		System.out.println(s.findSqrRoot(120));
		
	}
}

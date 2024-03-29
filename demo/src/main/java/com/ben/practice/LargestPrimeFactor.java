package com.ben.practice;

public class LargestPrimeFactor {

	
	long findLargestPrimeFactor(long n)
	{
		Long f=n;
		while(n%2==0)
		{
			n/=2;
			f=n;
		}

		for(int i=3; i<=Math.sqrt(n);i+=2)
		{
			while(n%i==0)
			{
				n/=i;
				f= (long) i;
			}
			if(n>2) {
				f=n;
			}
		}
		return f;
	}
	
	public static void main (String[] arg)
	{
		LargestPrimeFactor l = new LargestPrimeFactor();
		System.out.println(l.findLargestPrimeFactor(13L));
	}
}


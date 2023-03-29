package com.ben.practice;

public class NthPrime {
	
	int findNthPrime(int n)
	{
		int nthPrime=2;
		int count=1;
		int num=2;
		if(n==1)
		{
			return num;
		}
		num=3;
		do
		{
			for(int i=3; i<=num; i+=2)
			{
				if(num%i==0&&num/i==1)
				{
					count++;
					nthPrime = num;
				}
				else if(num%i==0&&num/i>1)
				{
					break;
				}
			}
			num+=2;
		}while(count<n);
		
		return nthPrime;
	}
	
	public static void main(String[] args)
	{
		NthPrime p = new NthPrime();
		System.out.println(p.findNthPrime(10001));
	}

}

package com.ben.practice;
import java.util.Set;
import java.util.TreeSet;


public class ProductOfPrimes {
	
	Integer findLargestPositive(Integer n)
	{
		Integer p=1;
		Set<Integer> primes = new TreeSet<>();
		if(n>=2)
		{
			primes.add(2);
		}
		for(int i=3; i<=n; i+=2)
		{
			Set<Integer> primes2=new TreeSet<>(primes);
			boolean add=false;
				for(Integer j:primes2)
				{
					if(i%j!=0)
					{
						add=true;
					}
					else
					{
						add=false;
						break;
					}
				}
				if(add)
				{
				primes.add(i);
				}
		}
		for(Integer i:primes)
		{
			p=p*i;
		}
		
		return p;
	}

	public static void main(String[] args)
	{
		ProductOfPrimes s =new ProductOfPrimes();
		int p = s.findLargestPositive(10);
		System.out.println(p);
	}
}


package com.ben.practice;

public class EvenFibonacciSum {
	
	
	int sumOfEvenFibonacciUpto(int f)
	{
		
		int i=1;
		int j=2;
		int sum = 0;
		
		while(j<=f)
		{
			
			sum=sum+(j%2==0?j:0);
			int temp = i+j;
			i=j;
			j=temp;
		}
		return sum;
		
	}
	
	public static void main(String[] arg)
	{
		EvenFibonacciSum e = new EvenFibonacciSum();
		System.out.println(e.sumOfEvenFibonacciUpto(4000000));
		
	}

	

}

package com.ben.practice;

public class LargestPalindrome {
	
	int findPalindrome(int a, int b)
	{
		 int value = 0;
	        for(int i = a;i <=b;i++)
	        {
	            for(int j = i;j <=b;j++)
	            {
	                int value1 = i * j;
	                StringBuilder sb1 = new StringBuilder(""+value1);
	                String sb2 = ""+value1;
	                sb1.reverse();
	                if(sb2.equals(sb1.toString()) && value<value1) {
	                    value = value1;

	                }

	            }
	        }
		
		return value;
	}
	
	public static void main(String[] arg)
	{
		LargestPalindrome l = new LargestPalindrome();
		int p=l.findPalindrome(1000, 9999);
		System.out.println(p);
	}

}
package com.ben.practice;

import java.util.Arrays;

public class OddOccurrancesInArray {
	
	public static void main(String[] args)
	{
		Solution2 s = new Solution2();
		int[] A = {9, 3, 9, 3, 9, 7, 9};
		int unpaired = s.solution(A);
		System.out.println(unpaired);
	}
}

class Solution2 {
    public int solution(int[] A) 
    {
    	int unpaired = 0;
    	if(A.length==0)
    	{
    		return unpaired;
    	}
    	
    	Arrays.sort(A);
    	unpaired = A[0];
    	for(int i=0; i<A.length; i++)
    	{
    		System.out.println(A[i]);
    	}
    	
    	for(int i=1; i<A.length; i++)
    	{
    		if(unpaired == A[i])
    		{
    			unpaired=A[i+1];
    			i++;
    		}
    		
    	}
    	return unpaired;
    }
}
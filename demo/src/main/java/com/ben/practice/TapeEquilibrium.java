package com.ben.practice;

import java.util.Arrays;

public class TapeEquilibrium {
	public static void main(String[] args)
	{
		Solution5 s = new Solution5();
		int[] A = {3, 1};
		int missing = s.solution(A);
		System.out.println(missing) ;
	}
}

class Solution5 {
    public int solution(int[] A) {
    
    	int aL = A.length;
        
        if(aL==0)
        {
            return 0;
        }
        
        if(aL==1)
        {
            return A[0];
        }
        int dL = aL-1;
        int[] firstHalf = new int[dL];
        int[] secondHalf = new int[dL];
        
        firstHalf[0] = A[0];
        secondHalf[dL-1] = A[aL-1];
        
        for(int i = 1,j = dL-2; i<dL && j>=0; i++, j--)
        {
        	firstHalf[i] = firstHalf[i-1] + A[i];
        	secondHalf[j] = secondHalf[j+1] + A[j+1];
        }
        int[] difference = new int[dL];
        for(int i = 0; i<dL; i++)
        {
        	difference[i] = Math.abs(firstHalf[i] - secondHalf[i]);
        }
        Arrays.sort(difference);
        
        for (int i = 0; i<aL-1; i++)
        {
        	System.out.println(firstHalf[i] + " " + secondHalf[i]);
        }
        
        return difference[0];
    }
}


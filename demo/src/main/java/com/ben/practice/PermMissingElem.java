package com.ben.practice;

import java.util.Arrays;

public class PermMissingElem {
	
	public static void main(String[] args)
	{
		Solution4 s = new Solution4();
		int[] A = {4};
		int missing = s.solution(A);
		System.out.println(missing) ;
	}
}

class Solution4 {
    public int solution(int[] A) {
        // write your code in Java SE 8
    	int l = A.length;
    	int a = 0;
    	int b=5;
    	int c=b/a;
        if(l==0)
        {
            return 1;
        }
        int sum=0;
        for(int i:A)
        {
            sum=sum+i;
        }
        Arrays.sort(A);
        int smallest = A[0];
        int biggest = A[l-1];
        int missing = 0;
        int sumOfFullRange = ((biggest)*(biggest+1))/2;
        if(smallest>1)
        {
            int sumOfMissingRange = ((smallest-1)*(smallest))/2;
            int consideredRange = sumOfFullRange - sumOfMissingRange;
            missing = consideredRange - sum;
            if(smallest == 2)
            {
                missing = 1;
            }
        }
        else
        {
        	missing = sumOfFullRange - sum;
        	if(missing == 0)
            {
                missing = biggest+1;
            }
        }
        return missing;
    }
}
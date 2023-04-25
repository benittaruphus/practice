
package com.ben.practice;

import java.math.BigInteger;
import java.util.Arrays;

public class PermMissingElem {
	
	public static void main(String[] args)
	{
		Solution4 s = new Solution4();
		int[] A = {3,4};
		int missing = s.solution(A);
		System.out.println(missing) ;
		System.out.println("abc") ;
		System.out.print("cde") ;
		System.out.print("fgh") ;
		String binString = Integer.toBinaryString(1000);
		binString.length();
		
	}
}

class Solution4 {
    public int solution(int[] A) {
        // write your code in Java SE 8
    	int l = A.length;
        if(l==0)
        {
            return 1;
        }
        BigInteger sum=BigInteger.ZERO;
        for(int i:A)
        {
            //sum=sum+i;
            sum=sum.add(BigInteger.valueOf((long)i));
        }
        Arrays.sort(A);
        BigInteger smallest = BigInteger.valueOf((long)A[0]);
        BigInteger biggest =BigInteger.valueOf((long)A[l-1]);
        BigInteger missing=BigInteger.ZERO;
        BigInteger sumOfFullRange = ((biggest).multiply(biggest.add(BigInteger.ONE))).divide(BigInteger.valueOf((long)2));
        if(smallest.intValue()>1)
        {
        	BigInteger sumOfMissingRange = ((smallest).multiply(smallest.subtract(BigInteger.ONE))).divide(BigInteger.valueOf((long)2));
        	BigInteger consideredRange = sumOfFullRange.subtract(sumOfMissingRange);
            missing = consideredRange.subtract(sum);
            if(smallest.intValue() == 2)
            {
                missing = BigInteger.ONE;
            }
            if(missing.equals(BigInteger.ZERO))
            {
                missing = biggest.add(BigInteger.ONE);
            }
        }
        else
        {
        	missing = sumOfFullRange.subtract(sum);
        	if(missing.equals(BigInteger.ZERO))
            {
                missing = biggest.add(BigInteger.ONE);
            }
        }
        return missing.intValue();
    }
}

package com.ben.practice;

public class CyclingArrays {

	public static void main(String[] args)
	{
		Solution1 s = new Solution1();
		int[] A = {};
		int K = 12;
		int[] cycled = s.solution(A, K);
		System.out.println(cycled);
	}
//	int size = strings.size();
//	for (int i = -1; ++i < size;) 
}

class Solution1 {
    public int[] solution(int[] A, int K) 
    {
        // write your code in Java SE 8
    	int length = A.length;
    	int[] cycled = new int[length];
    	
    	if(length==0)
    	{
    		return cycled;
    	}
    	
    	while(K>length)
    	{
    		K = K-length;
    	}
    	int index = K;
    	for(int i=0; i<length; i++)
    	{
    		if(index>length-1)
    		{
    			index=0;
    		}
    		cycled[index] = A[i];
    		index++;
    	}
    	
    	
    	System.out.println(cycled[0]+" "+cycled[1]+" "+cycled[2]+" "+cycled[3]+" "+cycled[4]);
    	return cycled;
    }
    
    
}
    
    


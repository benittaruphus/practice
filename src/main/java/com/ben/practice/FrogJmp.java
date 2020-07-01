package com.ben.practice;

public class FrogJmp {
	
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int jumps = s.solution(1,5, 2);
		System.out.println(jumps);
	}
}

class Solution
{
	 public int solution(int X, int Y, int D) {
	        // write your code in Java SE 8
	        
		 if (X==Y)
		 {
			 return 0;
		 }
        int jumps = (Y-X)/D;
        int dist = (jumps*D);
        System.out.println(jumps);
        if((Y-X)==dist||X==D)
        {
        	return jumps;
        }
        else if(Y>dist)
        {
        	if(X==D)
        	{
        		return jumps-1;
        	}
            return jumps+1;
        }
        
        return jumps;
    }
}

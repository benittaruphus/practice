package com.ben.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrogRiverOne {
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[] A = {1, 3, 1, 2, 1};
		int missing = s.solution(1, A);
		System.out.println(missing) ;
	}
}

class Solution {
    public int solution(int X, int[] A) {
    	
    	int l = A.length;
        if(l<X)
        {
            return -1;
        }
//        if(X==1 && A[0]==1)
//       
//            return 0;
//        }
        if(sum(X) == sum(l))
        {
            return X;
        }
        List<Integer> leaves = new ArrayList<>();
        //int[] leaves = new int[X+1];
        for(int i:A)
        {
        	if(i<=X)
        	{
        		//leaves[i]=leaves[i]+1;
        		leaves.add(i, (leaves.get(i))+1);
        	}
        }
        int fastest = 0;
        
        for(int i=1; i<=X; i++)
        {
        	
        	if (leaves.get(i)==0)
        	{
        		return -1;
        	}
        }
        
        fastest = leaves.indexOf(o)
        
        return fastest;
    }
    
    int sum(int x)
    {
        return (x*(x+1))/2;
    }
}

package com.ben.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrogRiverOne {
	public static void main(String[] args)
	{
		Solution s = new Solution();
		int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
		int missing = s.solution(5, A);
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

        //List<Integer> leaves = new ArrayList<>(l);
        Map<Integer, Integer> leaves = new HashMap<>();
        for(int i=0; i<l; i++)
        {
        	int a= A[i];
        	if(a<=X)
        	{
        		if(leaves.get(a)==null)
        		{
        			leaves.put(a, i);
        		}
        		
        	}
        }
        
        
        List<Integer> indices = new ArrayList<>();
        for(int i=1; i<=X; i++)
        {
        	
        	if (leaves.get(i)==null)
        	{
        		return -1;
        	}
        	indices.add(leaves.get(i));
        	
        }
        Collections.sort(indices);
        
        int fastest = indices.get(X-1);
        //fastest = leaves.indexOf(0);
        
        return fastest;
    }
    
    int sum(int x)
    {
        return (x*(x+1))/2;
    }
}

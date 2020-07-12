package com.ben.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrogRiverOne2 {
	public static void main(String[] args)
	{
		SolutionF s = new SolutionF();
		int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
		int missing = s.solution(5, A);
		System.out.println(missing) ;
	}
}

class SolutionF {
    public int solution(int X, int[] A) {
    	int[] Y=new int[X];  // 0 if leaf dropped here before, else 1
        int sum=X*(X+1)/2; 
        for (int i=0;(i<A.length);i++){
        	int x = Y[A[i]-1];
            if (Y[A[i]-1]==0) { //the first time a leaf drops to this position
                Y[A[i]-1]=1;
                sum-=A[i]; 
                if (sum==0) return i;            
            }     
        }
        return -1;  
    }
    
    int sum(int x)
    {
        return (x*(x+1))/2;
    }
}

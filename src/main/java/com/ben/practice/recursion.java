package com.ben.practice;
import java.util.*;

public class recursion {

		public static void main(String[] args)
		{
			Solutionx s = new Solutionx();
			int[] A = {1, 3, 1, 2, 1};
			int missing = s.solution(-2,4,2,-4);
			System.out.println(missing) ;
		}
	}

	class Solutionx {
	    public int solution(int A, int B, int C, int D) {
	    	 int[] p = new int[4];
	         p[0] = A;
	         p[1] = B;
	         p[2] = C;
	         p[3] = D;
	         Arrays.sort(p);
	         
	         int x = p[3]-p[0];
	         System.out.println(x);
	         int y = p[2]-p[1];
	         System.out.println(y);
	         
	         return (x*x)+(y*y);
	}
	}

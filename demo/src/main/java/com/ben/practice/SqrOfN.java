package com.ben.practice;

import java.util.concurrent.CopyOnWriteArraySet;

public class SqrOfN {
	
	int findSqr(int n)
	{
		return n*n;
	}
	
	public static void main(String[] args1) {
		SqrOfN s = new SqrOfN();
		System.out.println(s.findSqr(2));
		
	}

}

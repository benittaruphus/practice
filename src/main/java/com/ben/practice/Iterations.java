package com.ben.practice;

public class Iterations {
	
	public static void main(String[] args)
	{
		ToTest t = new ToTest();
		int gap = t.solution(1500);
		System.out.println("1500 gap: "+gap);
		int gap1 = t.solution(23);
		System.out.println("23 gap: "+gap1);
		int gap2 = t.solution(4108);
		System.out.println("4108 gap: "+gap2);
		int gap3 = t.solution(919);
		System.out.println("919 gap: "+gap3);
	}
}

class ToTest
{
	
	public int solution(int N) {
        // write your code in Java SE 8
        String binary = Integer.toBinaryString(N);
        System.out.println("binary: "+binary);
        
        int gap = 0;
        int tempGap = 0;
        int beginIndex = 0;
        
        for(int i = 0; i<binary.length(); i++)
        {
            if(binary.charAt(i)=='1')
            {
            	if(i==0){
	                beginIndex = i;
	                continue;
            	}
            	if(i> beginIndex)
                {
            		tempGap = i-beginIndex-1;
            		beginIndex = i;
            		if(tempGap>gap)
            		{
            			gap = tempGap;
            		}
                }
            }
        }
        return gap;
    }
	
}



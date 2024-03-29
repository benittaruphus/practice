package com.ben.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryConsec1Count {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        BinaryConsec1Count sol = new BinaryConsec1Count();
        sol.findConsec1inBinary(n);
    }
    
    void findConsec1inBinary(int n)
    {
        if(n==0)
        {
            System.out.println(0);
            return;
        }
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        if(n>1000000)
        {
            System.out.println("invalid input");
            return;
        }
        String binary = Integer.toBinaryString(n);
        int finalCount=0;
        int count=0;
        int len = binary.length();
        for(int i=0; i<len; i++)
        {
            
            if(binary.charAt(i)=='1')
            {
                count++;
                if(i==len-1 && count>finalCount)
                {
                	finalCount=count;
                }
            }
            if(binary.charAt(i)=='0')
            {
                
                if(count>finalCount)
                {
                	finalCount=count;
                }
                count=0;
            }
            System.out.println("count"+count);
            System.out.println("final count"+finalCount);
        }
        System.out.println(binary);
        System.out.println(finalCount);
    }
    
   
}



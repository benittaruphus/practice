package com.ben.practice;
	
	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class HourglassSumMax {

	    /*
	     * Complete the 'hourglassSum' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
	     */

	    public static int hourglassSum(List<List<Integer>> arr) {
	    // Write your code here
	    
	    List<Integer> hourglassSums = new ArrayList<>();
	    for(int x=0; x<4; x++)
	    {
	    	for(int y=0; y<4; y++)
	    	{
	    		int sum=0;
	        sum = sum + arr.get(x).get(y)+arr.get(x).get(y+1)+
	                arr.get(x).get(y+2);
	        System.out.println(arr.get(x).get(y)+" "+arr.get(x).get(y+1)+" "+
	                arr.get(x).get(y+2));
	        sum = sum + arr.get(x+1).get(y+1);
	        System.out.println(arr.get(x+1).get(y+1));
	        sum = sum + arr.get(x+2).get(y)+arr.get(x+2).get(y+1)+
	                arr.get(x+2).get(y+2);
	        System.out.println(arr.get(x+2).get(y)+" "+arr.get(x+2).get(y+1)+" "+
	                arr.get(x+2).get(y+2));
	        System.out.println("----");
	        hourglassSums.add(sum);
	        
	    }
	    	System.out.println("----");
	    }
	    hourglassSums.sort(null);
	    return hourglassSums.get(15);
	    }
	 
	    public static void main(String[] args) throws IOException {
//	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        List<List<Integer>> arr = new ArrayList<>();

//	        for (int i = 0; i < 6; i++) {
//	            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

//	            List<Integer> arrRowItems = new ArrayList<>();

//	            for (int j = 0; j < 6; j++) {
//	                int arrItem = Integer.parseInt(arrRowTempItems[j]);
//	                arrRowItems.add(arrItem);
//	            }
//	        arr.add(arrRowItems);
//	    }
	        List<Integer> arrRowItems1 = new ArrayList<>();
	        arrRowItems1.add(1);
	        arrRowItems1.add(1);
	        arrRowItems1.add(1);
	        arrRowItems1.add(0);
	        arrRowItems1.add(0);
	        arrRowItems1.add(0);
	        
	        List<Integer> arrRowItems2 = new ArrayList<>();
	        arrRowItems2.add(0);
	        arrRowItems2.add(1);
	        arrRowItems2.add(0);
	        arrRowItems2.add(0);
	        arrRowItems2.add(0);
	        arrRowItems2.add(0);
	        
	        List<Integer> arrRowItems3 = new ArrayList<>();
	        arrRowItems3.add(1);
	        arrRowItems3.add(1);
	        arrRowItems3.add(1);
	        arrRowItems3.add(0);
	        arrRowItems3.add(0);
	        arrRowItems3.add(0);
	        
	        List<Integer> arrRowItems4 = new ArrayList<>();
	        arrRowItems4.add(0);
	        arrRowItems4.add(0);
	        arrRowItems4.add(0);
	        arrRowItems4.add(0);
	        arrRowItems4.add(0);
	        arrRowItems4.add(0);
	        
	        List<Integer> arrRowItems5 = new ArrayList<>();
	        arrRowItems5.add(0);
	        arrRowItems5.add(0);
	        arrRowItems5.add(0);
	        arrRowItems5.add(0);
	        arrRowItems5.add(0);
	        arrRowItems5.add(0);
	        
	        List<Integer> arrRowItems6 = new ArrayList<>();
	        arrRowItems6.add(0);
	        arrRowItems6.add(0);
	        arrRowItems6.add(0);
	        arrRowItems6.add(0);
	        arrRowItems6.add(0);
	        arrRowItems6.add(0);

	            arr.add(arrRowItems1);
	            arr.add(arrRowItems2);
	            arr.add(arrRowItems3);
	            arr.add(arrRowItems4);
	            arr.add(arrRowItems5);
	            arr.add(arrRowItems6);

	        int result = HourglassSumMax.hourglassSum(arr);
	        System.out.println(result);

//	        bufferedWriter.write(String.valueOf(result));
//	        bufferedWriter.newLine();

//	        bufferedReader.close();
//	        bufferedWriter.close();
	    }
	}


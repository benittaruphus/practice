package com.ben.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import org.apache.commons.lang3.StringUtils;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
//    for(int i=1; i<=n; i++)
//        {
//        for(int j=n-i;j>=1;j--)
//        {
//            System.out.print(" ");
//        }
//        for(int k=1; k<=i; k++)
//        {
//            
//            System.out.print("#");
//        }
//        System.out.println("");
//        }
//    }
//    
//    or
    for(int i=0; i<n; i++)
    {
        String s ="#";
        
        s=StringUtils.leftPad(s, n-i, " ");
        s=StringUtils.rightPad(s, n, "#");
    System.out.println(s);
    }
}

}

public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result1.staircase(n);

        bufferedReader.close();
    }
}


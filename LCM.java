package com.ben.practice;

import java.util.List;
import java.util.ArrayList;

//Java Program to find LCM of n elements
public class LCM {
	
	public static long lcm_of_array_elements(Integer n)
	{
		
		List<Integer> numbers = new ArrayList<>();
		
		for(int i=2; i<=n; i++)
		{
			numbers.add(i);
		}
		
		int lcm = 1;
		int factor = 2;
		
		while (true) {
			int counter = 1;
			boolean divisible = false;
			
			for (int i = 0; i < n-1; i++) {
				System.out.println(i);
				// lcm_of_array_elements (n1, n2, ... 0) = 0.
				// For negative number we convert into
				// positive and calculate lcm_of_array_elements.

				if (numbers.get(i) == 1) {
					counter++;
				}

				// Divide element_array by devisor if complete
				// division i.e. without remainder then replace
				// number with quotient; used for find next factor
				if (numbers.get(i) % factor == 0) {
					divisible = true;
					
					numbers.set(i, numbers.get(i) / factor);
					System.out.println("divide"+numbers);
				}
			}

			// If divisor able to completely divide any number
			// from array multiply with lcm_of_array_elements
			// and store into lcm_of_array_elements and continue
			// to same divisor for next factor finding.
			// else increment divisor
			if (divisible) {
				lcm = lcm * factor;
				System.out.println(lcm);
				System.out.println("multiply"+numbers);
			}
			else {
				factor++;
			}

			// Check if all element_array is 1 indicate
			// we found all factors and terminate while loop.
			if (counter > numbers.size()) {
				System.out.println(counter);
				System.out.println("lcm"+numbers);
				return lcm;
			}
		}
	}
	
	// Driver Code
	public static void main(String[] args)
	{
		int[] element_array = { 1,2, 3,4,5,6,7,8,9,10};
		System.out.println(lcm_of_array_elements(20));
	}
}

//Code contributed by Mohit Gupta_OMG

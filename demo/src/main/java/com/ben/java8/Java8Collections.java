package com.ben.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Collections {
	public static void main(String[] args)   
	{  
	//returns a list view   
	List<String> slist = Arrays.asList("Tanu", "Kamal", "Suman", "Lucky", "Bunty", "Bunty", "Amit");  
	List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());   
	slist.stream().forEach(action);
	sortedList.forEach(System.out::println);  
	
	Set<String> sortedSet = slist.stream().sorted().collect(Collectors.toSet());
	sortedSet.forEach(System.out::println);  
	
	
	ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
	//You can try using these different ways below.

	//Using mapToInt

	Integer sum = numberList.stream().mapToInt(Integer::intValue).sum();
	//Using summarizingInt

	long sum1 = numberList.stream().collect(Collectors.summarizingInt(Integer::intValue)).getSum();
	//Using reduce

	Integer sum2 = numberList.stream().reduce(Integer::sum).get().intValue();
	
	IntStream.of(1, 2, 23).sum();
	IntStream.of(1, 2, 23,1, 2, 23,1, 2, 23).max().getAsInt();
	
	
//	1.  List<Integer> list 
//    = Stream.of(1, 2, 3)
//        .collect(Collectors.toList());
//2.  List<Integer> list 
//    = Stream.of(1, 2, 3)
//        .collect(Collectors.toCollection(ArrayList::new));
//3.  List<Integer> list 
//    = Stream.of(1, 2, 3, 4)
//        .collect(Collectors.collectingAndThen(Collectors.toList(), 
//                    Collections::unmodifiableList));
	}  
}

package com.ben.practice;

public class BubbleSort {
	
	static void sort(int[] arr)
	{
		
		int n=arr.length;
		System.out.println("short bubble");
		for(int i=0; i<n; i++)
		{
			for(int j=1; j<n-i;j++ )
			{
				System.out.println(i+", "+j);
				if(arr[j-1]>arr[j])
				{
					int t=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=t;
					 System.out.println(i+", "+j);
					 for(int k=0; k<arr.length; k++){  
			                System.out.print(arr[k] + " ");  
			        }
					 System.out.println();
				}
			}
		}
		
		int[] arr1={3,60,35,2,45,320,5};
		System.out.println("long bubble");
		for(int i = 0;i < n; i++)
		{
		    for(int j=0;j < n - 1; j++)
		    {
		    	System.out.println(i+", "+j);
		        if(arr1[j] > arr1[j+1]){
		            int temp = arr1[j];
		            arr1[j] = arr1[j+1];
		            arr1[j+1] = temp;
		            System.out.println(i+", "+j);
					 for(int k=0; k<arr1.length; k++){  
			                System.out.print(arr1[k] + " ");  
			        }
					 System.out.println();
		       }
		    }
		}
		
		
		int[] arr2={3,60,35,2,45,320,5};
		System.out.println("insertion");
		for(int i = 1;i < n; i++) {
		    int j = i;
		    while(j > 0 && arr2[j] < arr2[j-1]) {
		        int temp = arr2[j];
		        arr2[j] = arr2[j-1];
		        arr2[j-1] = temp;
		        j--;
		    }
		}
	}
	
	
	public static void main (String[] args)
	{
		int arr[] ={3,60,35,2,45,320,5};  
        
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
          
        sort(arr);//sorting array elements using bubble sort  
         
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
	}

}

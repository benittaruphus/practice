package com.ben.practice;

public class SqrTrianglePrdcts {

	
	static Long triangleNumber(Long i) {
		return (i*(i+1))/2;
	}
	
	static Boolean checkIfSquare(Long s)
	{
		Double d = Math.sqrt(s);
		Double diff = (Math.ceil(d)-d);
		return (diff<=0);
	}
	public static void main(String [] args) {
		Double x = Math.pow(10, 35);
		Long sum=0L;
		Double sqrt =0.0;
		Long i=1L;
		while(i<x)
		{
			Long j=i+1;
			while(j<=x)
			{
				if(i==j)
				{
					
				}
				else
				{
					Long t1 = triangleNumber(i);
					Long t2 = triangleNumber(j);
					Long product = t1*t2;
					sqrt = Math.sqrt(product);
					if(sqrt>x)
					{
						break;
					}
					if(checkIfSquare(product))
					{
						//System.out.println(i+", "+j+" Triangle numbers "+t1+" x "+t2+" = "+product+" : "+sqrt);
						sum = (long) (sum + sqrt);
					}
					//System.out.println("//"+i+", "+j+" Triangle numbers "+t1+" x "+t2+" = "+product+" : "+sqrt);
				}
				j++;
			}
			i++;
		}
		
		System.out.println("SqrTrianglePrdcts for "+x+" = "+sum);
	}
}

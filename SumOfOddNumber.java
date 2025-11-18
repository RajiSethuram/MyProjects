package com.Java.Practices;

public class SumOfOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		
		for(int i=1;i<=100;i+=2)
		{
			sum +=i;
			System.out.println(i);
		}
		
		System.out.println("Sum Of Odd Number Upto 100 is	  :"+sum);
	}

}

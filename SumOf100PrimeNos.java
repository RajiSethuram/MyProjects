package com.Java.Practices;

import java.util.Scanner;

public class SumOf100PrimeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 0;
		int n=100;
		int p=0;

		//Scanner s = new Scanner(System.in);
		//n=s.nextInt();
		
		if((n==0)||(n==1))
		{
			val=1;
		}
		else
		{
			for(int x=2;x<=100;x++)
			{
				val=0;
				for(int i=2;i<=x/2;i++)
				{

					if(x%i==0)
					{
						val=1;
					}
				}
				if(val==0)
		        {
		            p += x;
					System.out.println("Prime numbers :"+x);

		        }
				
				
			}
			System.out.println("Sum of 100 prime number is:"+p);

		}
	}

}

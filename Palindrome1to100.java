package com.Java.Practices;

public class Palindrome1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,rev=0,i;
		for(i=1;i<=100;i++)
		{
			int j=i;
			while(j!=0)
			{
				x=j%10;
				rev=rev*10+x;
				j=j/10;
			}
			if(i==rev)
			{
				System.out.println("Palindrome"+i);
			}
			
			rev=0;
		}
	}

}

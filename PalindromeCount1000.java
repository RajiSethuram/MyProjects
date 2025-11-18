package com.Java.Practices;

public class PalindromeCount1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,i,rev=0,count=0;
		for(i=1;i<=1000;i++)
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
				System.out.println(i);
				count=count+1;
			}
			rev=0;
		}
		System.out.println("Count of Palindrome in 1 to 1000 is		:"+count);
	}

}

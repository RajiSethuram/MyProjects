package com.Java.Practices;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,n,rev=0;
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		int val=n;
		while(n!=0)
		{
			x=n%10;
			rev=rev*10+x;
			n=n/10;
		}
		if(val==rev)
		{
			System.out.println("The given number is Palindrom");
		}
		else
		{
			System.out.println("The given number is Not a Palindrom");
		}
				
		
	}

}

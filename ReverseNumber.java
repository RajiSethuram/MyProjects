package com.Java.Practices;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0,n,x;
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Give number");
		while(n!=0)
		{
			x=n%10;
			rev=rev*10+x;
			n=n/10;
		}
		System.out.println("Reverse of given number is	:"+rev);
	}

}

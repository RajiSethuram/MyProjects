package com.Java.Practices;

import java.util.Scanner;

public class FindEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		if((n%2)==0)
		{
			System.out.println("The given number is Even");
		}
		else
		{
			System.out.println("The given number is Odd");

		}
	}

}

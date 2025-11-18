package com.Java.Practices;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digi=0;
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		while(n!=0)
		{
			n=n/10;
			digi++;
		}
		System.out.println(digi);
	}

}

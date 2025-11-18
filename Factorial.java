package com.Java.Practices;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=1;
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			f*=i;
		}
		System.out.println("Sum of" + n +"factorial 	:"+f);

	}

}

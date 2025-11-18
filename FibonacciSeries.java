package com.Java.Practices;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// The list of the first 10 Fibonacci numbers are 0, 1, 1, 2, 3, 5, 8, 13, 21,34
		

		int n;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int x = 0, y = 1, z = 0;
		System.out.print(x);
		for (int i = 1; i <= n; i++) {
			z = x + y;
			System.out.print(" " + z);
			x = y;
			y = z;

		}
	}

}

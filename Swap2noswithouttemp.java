package com.Java.Practices;

public class Swap2noswithouttemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=5,y=10;
		
		System.out.println("X Value is :"+x);
		System.out.println("Y Value is :"+y);
		y=x+y;
		x=y-x;
		y=y-x;
		System.out.println("X Value is :"+x);
		System.out.println("Y Value is :"+y);
		
		
		
		
		
	}

}

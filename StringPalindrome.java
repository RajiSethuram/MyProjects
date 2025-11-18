package com.Java.Practices;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		char[] c=new char [str.length()];
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			c[i]=str.charAt(i);
			rev=rev+c[i];
		}
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("String Palindrome");
		}
		else
		{
			System.out.println("Not a String Palindrome");
		}
		
	}

}

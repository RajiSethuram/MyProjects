package com.Java.Practices;

public class ReversString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Florida";
		String rev = "";
		char[] c=new char[s.length()];
		
		for(int i=s.length()-1;i>=0;i--)
		{
			c[i]=s.charAt(i);
			rev=rev+c[i];
		}
		System.out.println(rev);
		
	}

}

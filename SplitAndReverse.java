package com.Java.Practices;

public class SplitAndReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Java is a high level1 generAl purposE 2 obJectoriented and3 secure programming language";
		String[]  ns=s.split(" ");
		String rev=" ";
		for(int i=0;i<ns.length;i++)
		{

			String ss=ns[i];
			char[] c= new char[ss.length()];
			
			for(int j=ss.length()-1;j>=0;j--)
			{
				c[j]=ss.charAt(j);
				rev=rev+c[j];
			}
			rev = rev + " ";
		}
		System.out.println(rev);

	}

}

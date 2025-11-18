package com.Java.Practices;

public class StringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int small=0, caps=0,digi=0,space=0,special=0;
		String s= "Java is a high-level1, generAl-purposE,2 obJect-oriented, and3 secure programming language";
		char c[]= new char [s.length()];
		for(int i=0;i<s.length();i++)
		{
			c[i]=s.charAt(i);
			
			if(Character.isDigit((c[i])))
			{
				digi++;
			}
			else if(Character.isLowerCase(c[i]))
			{
				small++;
			}
			else if(Character.isUpperCase(c[i]))
			{
				caps++;
			}
			else if(Character.isWhitespace(c[i]))
			{
				space++;
			}
			else
			{
				special++;
			}
		}
		
		System.out.println("Small Letters	:"+small);
		System.out.println("Capital Letters	:"+caps);
		System.out.println("Numbers		:"+digi);
		System.out.println("Spaces		:"+space);
		System.out.println("Special Chars	:"+special);
	}

}

package com.Java.Practices;

public class VowelsNonvowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Java is a high-level, generAl-purposE, obJect-oriented, and secure programming language";
		char c[]= new char[s.length()];
		int vowels=0, consonants=0;
		
		for(int i=0;i<s.length();i++)
		{
			c[i]=Character.toLowerCase(s.charAt(i));
			
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' ||c[i]=='u')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		
		System.out.println("Vowels		:"+vowels);
		System.out.println("Consonants	:"+consonants);
	}

}

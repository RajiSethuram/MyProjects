package com.Java.Practices;

public class CountOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Even=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				Even+=1;
			}
			
		}
		
		System.out.println("Count Of Even Numbers 	:"+Even);
	}

}

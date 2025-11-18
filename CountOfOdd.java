package com.Java.Practices;

public class CountOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Odd=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
				Odd+=1;
			}
		}
		System.out.println("Count Of Odd Numbers	:"+Odd);
	}

}

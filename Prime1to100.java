package com.Java.Practices;

public class Prime1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int val=0,count=0;
		
		for(int i=2;i<=100;i++)
		{
			val=0;
			for(int j=2;j<i/2;j++)
			{
				if((i%j)==0)
				{
					val=1;
				}
			}
			if(val==0)
			{
				System.out.println(i);
				count+=1;
			}
		}
		System.out.println("Total Prime Numbers in 1 to 100  :"+count);
	}

}

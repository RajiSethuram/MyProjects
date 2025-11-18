package com.Java.Practices;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int val=0;
	    @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
	    int n= s.nextInt();
	    
	    if(n==0)
	    {
	    	val=1;
	    }
	    else {
	    	for(int i=1;i<=n/2;i++)
	    	{
	    		if((n%i)==0)
	    		{
	    			val=1;
	    		}
	    	}
	    }
	    
	    if(val==0)
	    {
	    	System.out.println("Prime Number");
	    }
	    else
	    {
	    	System.out.println("Non-Prime Number");
	    }
	}

}

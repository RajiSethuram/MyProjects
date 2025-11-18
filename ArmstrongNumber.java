package com.Java.Practices;


public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int n=1634,x,val,arms=0,p=0,c,real;
		real=n;
		c=n;
		while(c!=0)
		{
			c=c/10;
			p=p+1;
		}
		//System.out.println(p);

		while(n!=0)
		{
			x=n%10;
			val=(int) Math.pow(x, p);
			arms=arms+val;
			n=n/10;
		}
		if(real==arms)
		{
		System.out.println("The number is ArmstrongNumber"+arms);
		}
	}

}

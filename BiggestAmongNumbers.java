package com.Java.Practices;

public class BiggestAmongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] n = new int[]{2,12,7,3,5,9,11};
		 int big = 0;
		 
		for(int i=0;i<n.length;i++)
		{
			if(big<n[i]) {
				big = n[i];
			}
		}
		System.out.println(big);
	}

}

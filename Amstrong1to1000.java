package com.Java.Practices;

public class Amstrong1to1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  arms, i = 1, real, x, count = 0;

		for (i = 1; i <= 1000; i++)
		{
			real = i;
			arms = 0;

			while (real != 0)
			{
				x = real % 10;
				arms = arms + (x * x * x);
				real = real / 10;
			}
			if (arms == i)
			{
				System.out.println("Armstrong numer :" + arms);
				count = count + 1;
			}

		}
		System.out.println("Count of Armstrong Numbers in 1 to 1000		:" + count);
	}

}

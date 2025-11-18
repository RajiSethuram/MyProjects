package MyPak;


public class JArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 11, 2, 3, 4, 1, 5 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			sum = sum + a[i];
		}
		
		// Reversing Array
		
		System.out.println("Reversing array");
		for(int r=a.length-1;r>=0;r--)
		{
			System.out.println(a[r]);
		}
		System.out.println("Sum of array value is :" + sum);
		System.out.println("Average of array value is :" + sum / a.length);

		// Minimum value from array
		int min = a[0];
		for (int j = 0; j < a.length; j++) {
			if (min > a[j]) {
				min = a[j];
			}
		}
		System.out.println("Min Val   "+min);

		// Maximum Value

		int max = 0;
		for (int m = 0; m < a.length; m++) {
			if (max < a[m]) {
				max = a[m];

			}
		}
		System.out.println("Max Val   "+max);
		//Even indexed values
		
	for(int n=0;n<a.length;n+=2) {
		System.out.println("Even indexed values  :"+a[n]);
		
	}
	
	int[]b=a.clone();
	
	for(int r:b)
	{
		System.out.println(r);
	}
	
	}
	
}



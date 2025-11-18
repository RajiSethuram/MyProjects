package MyPak;

public class polystatic extends Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		sum(10, 20);
		sum(10, 20,30);
		sum(10, 20,30,40);
		}

}

class Addition{
	
	public static void sum(int a,int b)
	{
		int n=a+b;
		System.out.println(n);
	}
	
	public static void sum(int a,int b,int c)
	{
		int n=a+b+c;
		System.out.println(n);
	}
	public static void sum(int a,int b,int c,int d)
	{
		int n=a+b+c+d;
		System.out.println(n);
	}
	
	
}


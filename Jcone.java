package MyPak;

class  InstanceVaries
{
	int va=10;
	int vb=20;
	
	public void displayq()
	{
	System.out.println("Instance variables");
		
	}
	
}

public class Jcone {
	static int n=10;// Global static  variable
	int m=6;// Global non-static variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=2;
		
		InstanceVaries v= new InstanceVaries();
		

		System.out.println("Main method");
		Jcone j=new Jcone();
		j.amethod();
		//smethod();
	
		n=a+b;
		System.out.println("N valuse is : " +n);
		
		// Calling instance variables and method
		a=v.va;
		b=v.vb;
		v.displayq();
	}
	
	public void amethod()
	{
		System.out.println("A method");
		//System.out.println("N valuse is : " +n);

	}
	
	public static void smethod()
	{
		System.out.println("Static method");
		//System.out.println("N valuse is : " +n);


	}
}

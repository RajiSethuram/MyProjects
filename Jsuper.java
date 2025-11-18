package MyPak;

public class Jsuper {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int r=7,n=8;
		 C a=new C();
		 a.cClassMethod();
		 a.bClassMethod();
		 a.aClassMethod();
	}
}

class A
{
	int a=10,b=20;
	void aClassMethod()
	{
		System.out.println("A Class Method");
	}
}
class B extends A
{
	int x=5,y=6;
	void bClassMethod()
	{
		System.out.println("B Class Method");
		System.out.println("from A Class in B  :"+super.a);
		super.aClassMethod();
	}
}

class C extends B
{
	int m=2,n=3;
	void cClassMethod()
	{
		System.out.println("C Class Method");
		System.out.println("from B Class in C  :"+super.x);

	}
	
}
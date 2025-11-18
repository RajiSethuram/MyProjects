package MyPak;


public class Jctwo {
	static int x=Jcone.n;
	public static void main(String[] args) {
		Jcone j=new Jcone();
		//j.amethod();
	//	Jcone.smethod();
		int x=Jcone.n;
		
	ctwomethod();
		
	}

public static void ctwomethod()
{
	//j.amethod();
	//System.out.println("N valuse is : " +j.n);
	System.out.println("Static variable "+x);
	InstanceVaries v= new InstanceVaries();
	v.displayq();

}
}

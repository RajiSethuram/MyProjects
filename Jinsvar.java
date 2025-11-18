package MyPak;
class Info{
	int rollnumber=101;
	String name="Raji";
	String grade="B Grade";
	
}

public class Jinsvar {

	int insvar=5;

	static int n=100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Info a =new Info();
		
		System.out.println(a.rollnumber);
		System.out.println(a.name);
		System.out.println(a.grade);
		
		System.out.println("Static variable :"+n);
		
	}

}

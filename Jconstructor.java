package MyPak;

public class Jconstructor {
	
	// No-argument constructor
	Jconstructor() {
		
		
		  int rollno; 
		  String name; 
		  	int age;
		 
	}
	
	// Parameterized constructor
	Jconstructor(int rollno, String name)
	{
		System.out.println("Roll Number="+rollno);
		System.out.println("Name 	"+name);	
		
	}
	
	Jconstructor(int age)
	{
		System.out.println("Age 	="+age);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jconstructor j= new Jconstructor(1001, "Raji");

		Jconstructor j1= new Jconstructor(12);

	}

}

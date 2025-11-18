package MyPak;

public class JForForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n[]= {111,112,113,114,115,116,117,118};
		
		for(int i=0;i<=n.length-1;i++)
		{
			System.out.println(n[i]);
		}
		System.out.println("***********");

		
		for(int j:n)
		{
			System.out.println(j);
		}
	}
	

}

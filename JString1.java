package MyPak;

public class JString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= new String("hi how are you doing");
		String[] s1=s.split(" ");
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		System.out.println(s1[2]);
		System.out.println(s1[3]);
		System.out.println(s1[4]);
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}




	}

}

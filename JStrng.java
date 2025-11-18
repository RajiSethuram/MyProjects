package MyPak;

public class JStrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String val1 = "HeLLo"; String Val2 = "hello";
		  System.out.println("To Lower Case	: "+val1.toLowerCase());
		  System.out.println("To Upper Case	: "+Val2.toUpperCase());
		  System.out.println("Length of Val1  :" +val1.length());
		  System.out.println("Both Equal ..? 	: "+val1.equals(Val2));
		  System.out.println("Equals Ignorence  :"+val1.equalsIgnoreCase(Val2));
		  System.out.println("4th letter  	:"+ val1.charAt(3));
		  System.out.println("HeLLo Cotains L :"+val1.contains("L"));
		  System.out.println("Ends with O     :"+val1.endsWith("O"));
		  System.out.println("Ends with o     :"+val1.endsWith("o"));
		  System.out.println("Starts with H    :"+val1.startsWith("H"));
		  System.out.println("Join 2 String    :"+val1.concat(Val2));
		 

		//Remove Duplicate char
		
		String s ="selenium";
		
		String a = " ";
		
		System.out.println("Orignal String	:"+s );

		
		char[] sc=new char[s.length()];
				
		for(int i=0;i<s.length();i++)
		{
			sc[i]=s.charAt(i);
		}
		
		for(int n=0;n<sc.length;n++)
		{
			for(int m=n+1;m<sc.length;m++)
			{
				if(sc[n]==sc[m])
				{
					//System.out.println("duplicated chars are   :"+sc[m]);
					sc[m]=' ';
					sc[n]=' ';
				} 
				
			}
			a +=sc[n];
		}
		System.out.println("Duplicates Removed	:"+a);

	}

}

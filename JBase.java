package MyPak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class JBase {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		
		
		  BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		  
		  System.out.println("Enter your Marks");
		  int marks =Integer.parseInt(bfr.readLine());
		  
		 
		
		//int marks =77;
		
		if(marks>80)
		{
			System.out.println("Distiction");
		}
		else if(marks<80 && marks>70){
			
			System.out.println("A Grade");
		}
		else if(marks<70 && marks>60)
		{
			System.out.println("B Grade");	
		}
		else if(marks<60 && marks>50)
		{
			System.out.println("C Grade");
		}
		else 
		{
			System.out.println("FAIL");
		}
		
		
	}

}



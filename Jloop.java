package MyPak;

public class Jloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0, mul=1;		
		  for(int i=1;i<=10;i++) {
		  System.out.println(i); sum += i; mul *=i; 
		  }
		  System.out.println("Sum of the value is " +sum);
		  System.out.println("Multiplication  of the value is " +mul);

		  //Printing Even numbers
		  System.out.println("Even Numbers");
		  for(int j=1;j<=10;j++)
		 { 
			  if(j%2==0) 
			  { 
				  System.out.println(j);
			  } 
		  }
		  
		  //Printing Even numbers without if statement  
		  System.out.println("Even Numbers without if Statement");
		  for(int j=0;j<=10;j=j+2)
		  { 
				  System.out.println(j);
		  }
		 
		  //Printing Odd numbers with if statement 
	
		 System.out.println("Odd Numbers");
		  for(int n=1;n<=10;n+=2)
			  
		  { 
			 System.out.println(n);
		  }
		  
		  //Printing Odd numbers without if statement 

		  System.out.println("Odd Numbers without if Statement");
		  for(int j=1;j<=10;j=j+2)
		  { 
				  System.out.println(j);
		  }
		  //Printing 5 tables
		
		  for(int i=1;i<=10;i++) 
		  { 
			  int val=5*i; 
			  System.out.println("5*"+i+"="+val); 
			  //System.out.println("5*"+i+"="+5*i); 
			 
		  }
		 
		
		
		
	}


}

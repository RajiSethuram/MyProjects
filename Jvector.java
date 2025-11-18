package MyPak;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Jvector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> jv= new Vector<String>(2);
		//System.out.println(jv.capacity());
		jv.add("Test1");
		jv.add("Test1");
		jv.add("Test1");
		jv.add("Test1");
		jv.add("Test1");
		jv.add("Test5");
		jv.add("Test5");
		jv.add("Test5");
		jv.add("Test5");
		jv.add("Test5");
		jv.add("Test5");
		jv.capacity();
		
		
		List<String> subv= new ArrayList<String>();
		
		subv=jv.subList(4, 8);		
		System.out.println("Sub lists are :"+subv);

		System.out.println(jv.capacity());
		
		Enumeration<String> enu = jv.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
	
		}
		
		Iterator<String> it= jv.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		

	}

}

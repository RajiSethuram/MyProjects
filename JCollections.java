package MyPak;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class JCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<String> ar = new 	ArrayList<String>();

ar.add("test1");
ar.add("test2");
ar.add("test3");
ar.add("test3");



//ar.clear();
System.out.println(ar.isEmpty());
/*
 * //ar.clear(); boolean b =ar.removeAll(ar);
 * System.out.println("All elements removed  :"+ b);
 */
 
 Iterator<String> it =ar.iterator();
 	while(it.hasNext())
 	{
 		System.out.println(it.next());
 	
 	}
		
	}
	
	
	


}

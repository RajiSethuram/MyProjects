package MyPak;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class JLinklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("Test1");
		ls.add("Test2");
		ls.add("Test3");

		//System.out.println(ls);


		
		/*
		 * for(String tst:ls) { System.out.println(tst);
		 * 
		 * }
		 */
		
		
		
		  Collection<String> collect = new LinkedList<String>();
		  collect.add("Collect1"); 
		  collect.addAll(ls); 
		//  System.out.println(collect);
		  
		  
		  
		  Iterator<String> it=ls.iterator(); 
		  while(it.hasNext()) {
		  System.out.println(it.next()); }
		 
	}

}

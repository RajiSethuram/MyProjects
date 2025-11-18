package MyPak;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class JLinkedhasset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//insertion order hash set
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("test2");
		lhs.add("test3");
		lhs.add("test1");
		lhs.add("test4");
		lhs.add("test4");
		
		Iterator<String> it= lhs.iterator();
		while(it.hasNext())
		{
			System.err.println(it.next());
		}

	}

}

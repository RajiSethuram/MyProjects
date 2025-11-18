package MyPak;

import java.util.HashSet;
import java.util.Iterator;

public class JHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("test1");
		hs.add("test2");
		hs.add("test3");
		hs.add("test4");
		hs.add("test4");

		
		Iterator<String> it= hs.iterator();
		while(it.hasNext())
		{
			System.err.println(it.next());
		}
		

	}

}

package MyPak;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Jtreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> ts = new TreeSet<String>();
		
		ts.add("test2");
		ts.add("test3");
		ts.add("test1");
		ts.add("test4");
		ts.add("test4");
		ts.add(" ");
		ts.add(" ");
		
		Iterator<String> it= ts.iterator();
		while(it.hasNext())
		{
			System.err.println(it.next());
		}

	}

}

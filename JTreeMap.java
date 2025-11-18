package MyPak;

import java.util.Map;
import java.util.TreeMap;

public class JTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer,String> tm=new TreeMap<Integer, String>();

		tm.put(1, "Raji");
		tm.put(4, "Raji");
		tm.put(3, "Kumar");
		tm.put(2, "Raj");
		System.out.println(tm);
	}


}

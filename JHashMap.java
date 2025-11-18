package MyPak;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap = new HashMap<>();

        // Add elements to the HashMap
        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Jim", 35);

       //Using Iterator
        Iterator<Map.Entry<String, Integer>> it=hashMap.entrySet().iterator();
        
        while(it.hasNext())
        {
        	Map.Entry<String, Integer> entry =it.next();
        	System.out.println("Key : "+entry.getKey()+"  Value = "+entry.getValue());
        }
        
        
		//Using enhanced for
		  // Iterate through the HashMap 
		  for (Map.Entry<String, Integer> entry :hashMap.entrySet())
		  { System.out.println(entry.getKey() + " -> "+entry.getValue()); }
		 
	}

}

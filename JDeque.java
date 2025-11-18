package MyPak;

import java.util.ArrayDeque;

public class JDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayDeque<String> adq= new ArrayDeque<String>();
		
		adq.add("First");
		adq.addFirst("Added First");
		adq.addLast("Added Last");
		adq.removeFirst();
		//adq.removeLast();
		
		System.out.println(adq);
		
		
	}

}

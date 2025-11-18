package MyPak;

import java.util.Iterator;
import java.util.Stack;

public class JStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stk = new Stack<String>();
		stk.add("1first");
		stk.add("2second");
		stk.add("3first");
		stk.add("4second");
		stk.add("5first");
		stk.add("6second");
		stk.add("7first");
		stk.add("8second");
		stk.add("9first");
		stk.add("10second");
		int n=stk.capacity();
		System.out.println(n);
		 stk.push("push");
		 stk.add("Added Push");
		 
		/*
		 * 
		 * //stk.pop(); System.out.println(stk.capacity());
		 * System.out.println(stk.peek()); System.out.println(stk);
		 */
		// System.out.println("Hi");

		/*
		 * for(String st:stk) { System.out.println(st); }
		 */

		
		  Iterator<String> it= stk.iterator();
		  
		  while(it.hasNext()) 
		  { 
		  System.out.println(it.next()); }
		  
		 
	}

}

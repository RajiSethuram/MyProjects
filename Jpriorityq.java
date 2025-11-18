package MyPak;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;


public class Jpriorityq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> q = new PriorityQueue<String>();
		q.add("One");
		q.add("Two");
		q.add("Three");
		q.add("Four");
		
		

		System.out.println(q);

		System.out.println("Offered"+q.offer("offered"));
		
		q.add("Five");
		q.add("six");
		System.out.println(q);
		q.remove();
		System.out.println(q);
		q.remove();
		System.out.println(q);


		//System.out.println("Poll"+q.poll());
		
		//System.out.println("Peek"+q.peek());
		//System.out.println("Element"+q.element());
	
		
		//q.remove();
		//System.out.println(q);
		
		
		
		/*
		 * Iterator<String> it=q.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
		
	}

}

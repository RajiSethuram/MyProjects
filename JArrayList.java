package MyPak;

import java.util.ArrayList;

public class JArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        ArrayList<String> fruits = new ArrayList<>();

		        // Add elements
		        fruits.add("Apple");
		        fruits.add("Banana");
		        fruits.add(0, "Orange"); // Add at specific index
		        
		     // Enhanced for-loop to iterate through the list
		        for (String fruit : fruits) {
		            System.out.println(fruit);
		        }

		        System.out.println("Fruits: " + fruits); // Output: Fruits: [Orange, Apple, Banana]

		        // Get an element
		        String firstFruit = fruits.get(0);
		        System.out.println("First fruit: " + firstFruit); // Output: First fruit: Orange

		        // Set an element or replace apple with grape or updating element
		        fruits.set(1, "Grape");
		        System.out.println("Fruits after setting: " + fruits); // Output: Fruits after setting: [Orange, Grape, Banana]

		        // Remove an element
		        fruits.remove("Banana"); // Remove by object
		        System.out.println("Fruits after removing Banana: " + fruits); // Output: Fruits after removing Banana: [Orange, Grape]

		        fruits.remove(0); // Remove by index
		        System.out.println("Fruits after removing by index: " + fruits); // Output: Fruits after removing by index: [Grape]

		        // Get size
		        System.out.println("Number of fruits: " + fruits.size()); // Output: Number of fruits: 1

		        // Check if empty
		        System.out.println("Is fruits list empty? " + fruits.isEmpty()); // Output: Is fruits list empty? false
		       
		        

		        // Clear all elements
		        fruits.clear();
		        System.out.println("Fruits after clearing: " + fruits); // Output: Fruits after clearing: []
		        
		        
		        
	
	}

}

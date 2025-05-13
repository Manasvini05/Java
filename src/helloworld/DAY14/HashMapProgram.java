//13-05-2025
package helloworld.DAY14;

import java.util.HashMap;

public class HashMapProgram {

	public static void main(String[] args) {

		        HashMap<String, Integer> studentMarks = new HashMap<>();
		        
		        // Adding key-value pairs to the HashMap
		        studentMarks.put("Alice", 85);
		        studentMarks.put("Bob", 92);
		        studentMarks.put("Charlie", 78);
		        studentMarks.put("Alice", 90); // Overwrites the previous value for "Alice"
		        
		        // Printing the HashMap
		        System.out.println("Student Marks: " + studentMarks); 
		       
		
	}

}

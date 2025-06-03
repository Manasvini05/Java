package helloworld.Test03;

import java.util.HashMap;
import java.util.Map;

public class Test3_StringFrequency {

	public static void main(String[] args) {
	
		
		        String s = "this is java course this is intresting course";
		        String[] words = s.split(" ");

		        Map<String, Integer> frequency = new HashMap<>();

		 
		        for (String word : words) {
		            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
		        }

		        // Print word frequencies
		        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
		            System.out.println(entry.getKey() + " - " + entry.getValue());
		        }
		    }
		}


	

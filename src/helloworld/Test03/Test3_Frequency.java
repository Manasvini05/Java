package helloworld.Test03;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test3_Frequency {

	public static void main(String[] args) {
		String s="ameerpet";

		        Map<Character, Integer> freq = new LinkedHashMap<>();

		        for (char c : s.toCharArray()) {
		            freq.put(c, freq.getOrDefault(c, 0) + 1);
		        }

		        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
		            System.out.println(entry.getKey() + "-" + entry.getValue());
		        }
		    }
		}


	
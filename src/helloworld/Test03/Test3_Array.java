package helloworld.Test03;

import java.util.HashMap;
import java.util.Map;

public class Test3_Array {
	public static void main(String[] args) {

	        int[] arr = {4, 5, 6, 7, 4, 5, 8, 6};
	        Map<Integer,Integer> dou=new HashMap<>();
	        for (int n : arr) {
	            dou.put(n, dou.getOrDefault(n, 0) + 1);
	        }

	        System.out.print("Duplicate: ");
	        for (Map.Entry<Integer, Integer> entry1 : dou.entrySet()) {
	            if (entry1.getValue() > 1) {
	                System.out.print(entry1.getKey() + " ");
	            }
	        }

	        System.out.print("\nUnique: ");
	        for (Map.Entry<Integer, Integer> entry : dou.entrySet()) {
	            if (entry.getValue() == 1) {
	                System.out.print(entry.getKey() + " ");
	            }
	        }
	    

	}

}

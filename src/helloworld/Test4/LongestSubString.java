package helloworld.Test4;

import java.util.HashSet;

public class LongestSubString {

	public static void main(String[] args) {
		
		        String s = "abcabcbb";
		        int maxLength = 0;
		        int left = 0;

		        HashSet<Character> set = new HashSet<>();

		        for (int right = 0; right < s.length(); right++) {
		            while (set.contains(s.charAt(right))) {
		                set.remove(s.charAt(left));
		                left++;
		            }
		            set.add(s.charAt(right));
		            maxLength = Math.max(maxLength, right - left + 1);
		        }

		        System.out.println(maxLength);
		    }
		}
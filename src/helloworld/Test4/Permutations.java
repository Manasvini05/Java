package helloworld.Test4;

public class Permutations {

	public static void main(String[] args) {
	String s="abc";
	
	        permute(s, "");
	    }

	    static void permute(String s, String result) {
	        if (s.length() == 0) {
	            System.out.println(result);
	            return;
	        }

	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            String str = s.substring(0, i) + s.substring(i + 1);
	            permute(str, result + ch);
	        }
	    }
	}

	

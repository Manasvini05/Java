package helloworld.Test03;

public class Test3_PalindromeString {

	public static void main(String[] args) {
		
		        String s = "madam"; 
		        String f = new StringBuilder(s).reverse().toString();

		        if(s.equals(f)) {
		        	System.out.println("palindrome");
		        }
	}

}

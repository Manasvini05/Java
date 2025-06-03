//19-05-2025
package helloworld.DAY17;

public class PalindromeNameCheck {

	public static void main(String[] args) {
		
//		String name="java";
		String rn="name";
		String reverse="";
		for (int i=rn.length()-1;i>=0;i++) {
			reverse+=rn.charAt(i);
			
		}
		if(rn.equals(reverse)) {
			System.out.println(reverse);
		}else {
			System.out.println("invalid");
		}

	}

}

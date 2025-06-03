package helloworld.Test4;

public class String_Palidrome {

	public static void main(String[] args) {
		
		        String s = "A man, a plan, a canal: Panama";


		        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		        String rev = new StringBuilder(s).reverse().toString();

		        if (s.equals(rev)) {
		            System.out.println(true);
		        } else {
		            System.out.println(false);
		        }
		    }
		}

	
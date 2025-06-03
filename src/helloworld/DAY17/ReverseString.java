//19-05-2025
package helloworld.DAY17;

public class ReverseString {

	public static void main(String[] args) {
		
		String a="hello";
		String res="";
		for(int i=0;i<a.length();i++){
			res=a.charAt(i)+res;
			
		}
		String b="world";
		String rev="";
		for(int i=0;i<b.length();i++){
			rev=b.charAt(i)+rev;
			
		}
		System.out.print(res+" "+rev);
	}

}

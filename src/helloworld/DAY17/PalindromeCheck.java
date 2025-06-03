//19-05-2025
package helloworld.DAY17;

public class PalindromeCheck {

	public static void main(String[] args) {
		int num=131;
		int on=num;
		int reverse=0;
		while(on>0) {
			int d=on%10;
			reverse=(reverse*10)+d;
			on=on/10;
		}
       if(num==reverse) {
    	   System.out.println(num+"yes");
       }else {
    	   System.out.println(num+"no");
       }
	}

}

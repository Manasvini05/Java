package helloworld.Test03;

public class Test3_PalindromeInt {

	public static void main(String[] args) {
		int a=121;
		int b=123;
		int n=a;
		int n1=b;
		int r=0;
		int r1=0;
		
		while (n>0) {
			int d=n%10;
			r=(r*10)+d;
			n=n/10;
		}
		
		while (n1>0) {
			int d1=n1%10;
			r1=(r1*10)+d1;
			n1=n1/10;
		}
		if(a==r) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
       if(b==r1) {
	        System.out.println("true");
        }else {
	        System.out.println("false");
}

	}

}

//06-05-2025
package helloworld.DAY10;

public class ExceptionInBlocks {  //we can write multiple try catch exception in one program

	public static void main(String[] args) {
	 try { //block 1
        int[] n= {4,6,8,4,6,4};
        n[9] =60;
        
	 }catch(ArrayIndexOutOfBoundsException e) {
		 System.out.println("Array Error : "+e.getMessage());
	 }
//block 2
	 try {
		 String s=null;
		 System.out.println(s.length());
	 }catch (NullPointerException e) {
		 System.out.println("Null error : "+e.getMessage());
	 }
//  // Block 3
	 try {
		 int a=10/0;
		 
	 }catch(ArithmeticException e) {
		 System.out.println("MAth error : "+e.getMessage());
	 }
	 System.out.println("All exception will be handled and program continues ");

	 }

	}



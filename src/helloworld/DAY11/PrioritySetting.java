//07-05-2025
package helloworld.DAY11;
class Print10 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.print(" "+i+" ");
		}
	}
}
class PrintEven extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println("Even : "+i);
			}
		}
	}
}
class PrintOdd extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2 !=0) {
				System.out.println("Odd : "+i);
			}
		}
	}
}
public class PrioritySetting {

	public static void main(String[] args) {
		Print10 p=new Print10();
		PrintEven pe=new PrintEven();
		PrintOdd pd=new PrintOdd();
		
		p.setPriority(1);
		p.start();
		pe.setPriority(10);
		pe.start();
		pd.setPriority(5);
		pd.start();
		
	
		

	}

}

//07-05-2025
package helloworld.DAY11;
class thread1 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(" thread 1: "+i+ " ");
		}
	}
}
class thread2 extends Thread{
	public void run() {
		for(int i=10;i>=1;i--) {
			System.out.println(" thread 2: "+i);
		}
	}
}
public class MutliThread {

	public static void main(String[] args) {

		thread1 t1=new thread1();
		thread2 t2=new thread2();
		t1.start();
		t2.start();
		
	}

}



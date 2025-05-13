//07-05-2025
package helloworld.DAY11;
class koti extends Thread{
	public void run() {
		System.out.println("run");
	}
}
class ram extends Thread{
	public void run() {
		for(int i=10;i>=1;i--) {
			System.out.println("Thread 1: "+i);
		}
	}
}

public class RunThread {

	public static void main(String[] args) {
		koti k=new koti();
		ram r=new ram();
		k.start();
		r.start();

	}

}

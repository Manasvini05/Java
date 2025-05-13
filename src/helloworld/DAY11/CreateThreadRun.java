//07-05-2025
package helloworld.DAY11;

public class CreateThreadRun implements Runnable {
public void run() {
	System.out.println("Creating Thread Using runnable");
}
	public static void main(String[] args) {
		CreateThreadRun r=new CreateThreadRun();
		Thread t=new Thread(r);
		t.start();

	}

}

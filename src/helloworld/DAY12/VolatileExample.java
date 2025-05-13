//09-05-2025
package helloworld.DAY12;

public class VolatileExample {
	 private volatile int count = 0;

	    public void increment() {
	        count++; // NOT thread-safe (race condition)
	    }


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 VolatileExample example = new VolatileExample();

	        Thread t1 = new Thread(() -> {
	            for (int i = 0; i < 1000; i++) example.increment();
	        });

	        Thread t2 = new Thread(() -> {
	            for (int i = 0; i < 1000; i++) example.increment();
	        });

	        t1.start();
	        t2.start();
	        t1.join();
	        t2.join();

	        
	        System.out.println(example.count); // May not be 2000 due to race condition!


	}

}

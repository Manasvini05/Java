//09-05-2025
package helloworld.DAY12;

public class VolatileFlagExample {
	 private volatile boolean flag = true; // Shared volatile variable

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 VolatileFlagExample example = new VolatileFlagExample();

	        // Thread 1: Sets flag to false after 2 seconds
	        Thread thread1 = new Thread(() -> {
	            try {
	                Thread.sleep(2000); // Wait 2 seconds
	                example.flag = false; // Change the flag
	                System.out.println("Thread 1: Flag set to false");
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

 
	        // Thread 2: Continuously checks the flag
	        Thread thread2 = new Thread(() -> {
	            while (example.flag) { // Keeps running while flag is true
	                // Do something (e.g., print a message)
	                System.out.println("Thread 2: Flag is still true...");
	                try {
	                    Thread.sleep(500); // Small delay to avoid flooding console
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }

	            System.out.println("Thread 2: Detected flag change! Exiting...");
	        });

	        thread1.start(); // Start Thread 1
	        thread2.start(); // Start Thread 2


	}

}

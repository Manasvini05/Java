//09-05-2025
package helloworld.DAY12;

class Print1To10 extends Thread {
    public void run() {
        System.out.println("Thread: " + getName() + " (Priority: " + getPriority() + ")");
        for (int i = 1; i <= 10; i++) {
            System.out.println("1-10: " + i);
        }
    }
}

class PrintEven extends Thread {
    public void run() {
        System.out.println("Thread: " + getName() + " (Priority: " + getPriority() + ")");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

class PrintOdd extends Thread {
    public void run() {
        System.out.println("Thread: " + getName() + " (Priority: " + getPriority() + ")");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}


public class MultithreadExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Print1To10 t1 = new Print1To10();
	        PrintEven t2 = new PrintEven();
	        PrintOdd t3 = new PrintOdd();

	        t1.setName("1 to 10");
	        t2.setName("Even");
	        t3.setName("Odd");

	        t1.setPriority(Thread.NORM_PRIORITY); // 5
	        t2.setPriority(Thread.MAX_PRIORITY);  // 10
	        t3.setPriority(Thread.MIN_PRIORITY);  // 1

	        t1.start();
	        t2.start();
	        t3.start();

	}

}

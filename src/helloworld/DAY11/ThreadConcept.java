//07-05-2025
package helloworld.DAY11;

public class ThreadConcept extends Thread{
public void run() {
	System.out.println("this code is running");
}
	public static void main(String[] args) {
	    ThreadConcept t=new ThreadConcept();
	    t.start();

	}

}

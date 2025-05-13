//07-05-2025
package helloworld.DAY11;
class Run1 implements Runnable{
	public void run() {
		for(int i=0;i<=6;i++) {
			System.out.println("run 1 :"+i);
		}
	}
}
class Run2 implements Runnable{
	public void run() {
		for(int i=4;i<=6;i++) {
			System.out.println("run 2 :"+i);
		}
	}
	
}

public class RunThread1  {
	

	public static void main(String[] args) {
	
         Run1 r1=new Run1();
         Thread t1=new Thread(r1);
         t1.start();
         Run2 r2=new Run2();
         Thread t2=new Thread(r2);
         t2.start();
	}

}

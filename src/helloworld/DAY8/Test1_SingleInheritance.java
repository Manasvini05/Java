//04-05-2025
package helloworld.DAY8;
class TV{
	void display() {
		System.out.println("this is tv ");
	}
}
class Remote extends TV{
	void work() {
	System.out.println("remote is used to operate Tv ");
}
}
public class Test1_SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Remote r=new Remote();
        r.display();
        r.work();
	}

}

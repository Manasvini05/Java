//30-04-2025
package helloworld.DAY5;

interface a{
	void Show();
}
interface b{
	void show();
}
class c implements a,b{
	public void show() {
		System.out.println("this is b");
	}
	public void Show() {
		System.out.println("this is a");
	}
}
public class MultiplewithoutDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		c c1=new c();
		c1.show();
		c1.Show();
		}

}

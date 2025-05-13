//04-05-2025
package helloworld.DAY8;
class meals{
	void menu(String order) {
		System.out.println("they have ordered "+order+" for breakfast");
	}
	void menu(String order1,String order2) { 
		System.out.println("for lunch "+order1+" "+order2);
	}
	void menu(String order,int numOfOrders) { 
		System.out.println("order for dinner is "+order+" number of plates is "+numOfOrders);
	}
}
public class Test1_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meals m=new meals();
		m.menu("idli"); 
		m.menu("rice", "curry"); 
		m.menu("briyani", 2);
		

	}

}

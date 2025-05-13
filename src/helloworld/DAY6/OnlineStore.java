//01-05-2025
package helloworld.DAY6;
class Product{
	void showPrice() {
		System.out.println("the price of this item is 2000/- ");
	}
}
class ElectronicProduct extends Product{
	void showWarranty() {
		System.out.println("this product has 1 year warranty");
	}
}

public class OnlineStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Product p1=new Product();
//		p1.showPrice();
       ElectronicProduct e1=new ElectronicProduct();
       e1.showPrice();
       e1.showWarranty();
	}

}

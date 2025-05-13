//04-05-2025
package helloworld.DAY8;
class HumanBeings {
	void who() {
		System.out.println("Human beings are the only mamales who can communicate their thougths");
	}
}
class Male extends HumanBeings{
	void type1() {
		System.out.println("half of human beings are biological Males");
	}
}
class Female extends HumanBeings{
	void type2() {
		System.out.println("Half of human beings are bioogical Females");
	}
}
public class Test1_HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Male m=new Male();
		m.who();
		m.type1();
		System.out.println("");
		Female f=new Female();
		f.who();
		f.type2();
	}

}

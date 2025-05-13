//29-04-2025
package helloworld.DAY4;

public class trainer {
	String name;
	String edu;
	int age;
	char gender;
	int exp;
	void setDeatils(String name,String edu,int age,char gender, int exp) { //paramertized method 
		this.name=name;  //this keyword is used 
		this.edu=edu;
		this.age=age;
		this.gender=gender;
		this.exp=exp;
	}
	
	void display() {
		System.out.println("name of trainer is : "+name);
		System.out.println("qualification of trainer : "+edu);
		System.out.println("age of trainer : "+age);
		System.out.println("gender of trainer is : "+gender);
		System.out.println("exp of trainer : "+exp);
	}
	void endSentence() {
		System.out.println("The above are the deatils of trainer");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trainer t1=new trainer();
		t1.setDeatils("mala", "b.tech", 23, 'F', 2);
		t1.display();
        t1.endSentence();
	}

}

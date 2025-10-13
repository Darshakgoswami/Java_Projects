package basic;
class p1 {
	void displayP1() {
		System.out.println("P1 class ");
	}
}
class p2 extends p1 {
	void displayP2() {
		System.out.println("P2 class ");
	}
}
class p3 extends p1 {
	void displayP3() {
		System.out.println("Final Class");
	}
}

public class Hierarchical_Inheritance {
	public static void main(String[] args) {
		p2 obj1 = new p2();
		p3 obj2 = new p3();
		obj1.displayP1(); 
		obj1.displayP2(); 
		obj2.displayP1();  
		obj2.displayP3();  
	}
}
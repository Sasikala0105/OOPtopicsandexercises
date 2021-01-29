package Abstraction;


abstract class Parent {
	abstract void message();
	public void print() {
	}
}

class sub extends Parent {
	public void message() {
		System.out.println("This is first subclass");
		
	}
}

class sub1 extends Parent{
	public void message() {
		System.out.println("This is second subclass");
		
	}
}
public class ExeAbstract3 {

	public static void main(String[] args) {
		sub class1 = new sub();
		sub1 class2 = new sub1();
		class1.print();
		class2.print();

	}

}

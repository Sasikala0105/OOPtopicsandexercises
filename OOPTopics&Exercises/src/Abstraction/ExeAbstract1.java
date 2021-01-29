package Abstraction;
abstract class abstractClass{
	abstract void abstractMethod();
	void concreteMethod() { // concrete methods are still allowed in abstract classes
		System.out.println("This is a concrete method.");
	}
}

class B extends abstractClass{
	void abstractMethod() {
		System.out.println("B's implementation of abstractMethod.");
		
	}
}

class C extends abstractClass{
	void abstractMethod() {
		System.out.println("C's implementation of abstractMethod.");
	}
}

public class ExeAbstract1 {
	public static void main(String[] args) {
	B obj =new B();
	C obj1 = new C();
	obj.abstractMethod();
	obj.concreteMethod();
	obj1.abstractMethod();
	obj1.concreteMethod();
	}

}

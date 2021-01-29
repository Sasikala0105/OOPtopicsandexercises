package Abstraction;

abstract class Bank{
	abstract void getBalance();
	
}

class BankA extends Bank{
	void getBalance() {
		System.out.println("Balance Bank A : 100");
	}
}

class BankB extends Bank{
	void getBalance() {
		System.out.println("Balance Bank B : 150");
	}
}

class BankC extends Bank{
	void getBalance() {
		System.out.println("Balance Bank C : 200");
	}
}
public class ExeAbstract4 {

	public static void main(String[] args) {
		BankA A = new BankA();
		BankB B = new BankB();
		BankC C = new BankC();
		
		A.getBalance();
		B.getBalance();
		C.getBalance();
	}

}

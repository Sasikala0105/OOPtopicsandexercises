package Polymorphism;


public class ProtonX50 extends ProtonX70{

	String park;


	ProtonX50(){
	this.park=" :Auto Park";

	}

	public void parking() {
	System.out.println("Auto Parking assists\n" + park);
	
	}
	
	void run() {
		System.out.println("Proton X50 is running safely");
		super.run();
	}

}

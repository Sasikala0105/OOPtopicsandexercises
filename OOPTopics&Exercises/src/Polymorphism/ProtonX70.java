package Polymorphism;


public class ProtonX70 extends Proton{
	
	String autoPilot;
	ProtonX70(){
		this.autoPilot = "Auto park";
	}
	
	public void pilot() {
		System.out.println("Auto parking assists\n" + autoPilot );
	}
	
	void run() {
		System.out.println("Proton X70 is running safely");
	}
	}
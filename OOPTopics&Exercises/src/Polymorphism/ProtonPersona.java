package Polymorphism;
import java.util.Scanner;


public class ProtonPersona extends Proton {

	String bigBoot;
	
	ProtonPersona(){
		
		this.bigBoot = "SPACES";
	}
	
	public void boot() {
		System.out.println("Bigger boot space\n" + bigBoot);
	}
	
	void run() {
		System.out.println("Proton Persona is running safely");
		super.run();
	}
}

package Encapsulation;
import java.util.Scanner;


public class ProtonPersona extends Proton {

	String bigBoot;
	private String radio;
	private String key="remote";
	
	ProtonPersona(){
		System.out.println("Please enter boot space : ");
		Scanner in = new Scanner(System.in);
		String boot = in.next();
		
		this.bigBoot = boot;
	}
	
	public void boot() {
		System.out.println("Bigger boot space\n" + bigBoot);
	}
	
	//getter method for radio
	public String getRadio() {
		return radio;
	}
	
	//setter method for radio
	public void setRadio(String myradio) {
		this.radio = myradio;
	}
	
	//getter method for key
	public String getKey() {
		return key;
		
	}
	
}
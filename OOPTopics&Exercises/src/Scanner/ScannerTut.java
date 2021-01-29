package Scanner;
import java.util.Scanner;

public class ScannerTut {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("What's your first name?");
		String name = scan.next();
		
		System.out.println("What's your age?");
		int age = scan.nextInt();
		
		System.out.println("What's your gender?");
		String gender = scan.next();
	
		System.out.println("Where are you from?");
		String from = scan.next();	
		from += scan.nextLine();			
		
		System.out.println("What is your marital status?");
		String marital = scan.next();
		
		System.out.println("Hi, your name is "+ name + ", you are "+ age + " years old" + ", your gender is " + gender);
		System.out.println("and you're from " + from);
		System.out.println("Your marital status is " + marital);
	}

}

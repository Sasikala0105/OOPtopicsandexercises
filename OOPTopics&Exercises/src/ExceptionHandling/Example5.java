package ExceptionHandling;
//There are two ways of handling the exception, first catch the exception and take corrective action or throws the exception to the calling method which will force the calling method to handle it.
import java.util.Scanner;
public class Example5 {

	public static void main(String[] args) {
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter first number(numerator): ");
		int numerator = inputDevice.nextInt();	
		System.out.print("Please enter second number(denominator): ");
		int denominator = inputDevice.nextInt();
		
		try {
			new Example5().doDivide(numerator, denominator);
		} catch (Exception e) {
			System.out.println("Exception Condition Program is ending");
		}
	}
	public void doDivide (int a, int b) {
		float result = a/b;
		System.out.println("Division result of "+ a +"/" +b +"=" +result);
		
		

	}

}

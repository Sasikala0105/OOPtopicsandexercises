package ExceptionHandling;
/*
 * Exception handling works by transferring the execution of a program to an appropriate exception handler when an exception occurs. 
 * Let's take an example program which will do take two numbers from user and print division result on screen. 
 * This might lead to exception condition if the denominator is zero. 
 */
import java.util.Scanner;
public class Example3 {

	public static void main(String[] args) {
		//Scanner class is wrapper class of System.in object
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter first number(numerator): ");
		int numerator = inputDevice.nextInt();	
		System.out.print("Please enter second number(denominator): ");
		int denominator = inputDevice.nextInt();
	
		new Example3().doDivide(numerator, denominator);
	}

	public void doDivide (int a, int b) {
	float result = a/b;
	System.out.println("Division result of "+ a +"/" +b +"=" +result);
}
}

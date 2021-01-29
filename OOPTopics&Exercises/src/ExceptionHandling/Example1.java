package ExceptionHandling;

import java.util.Scanner;

/*
 * Imagine if , you put wrong password....
 * That's why if we have wrong password, there is simple message like 'invalid password'
 */

public class Example1 {
	

	public static void main(String[] args) {

		try {
		int[] myNumbers2 = {1, 2, 3};
		System.out.println(myNumbers2[10]); 
	}
		catch (Exception e) { //If an error occurs, we can use try...to catch the error
			System.out.println("Something went wrong.");
		}
		{
		try {
			int num = 40/0;
			System.out.println(num);
		}
		catch (ArithmeticException e) {
			System.out.println("You cannot divide by zero!");
		}
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter first number?");
		
			int n = scan.nextInt();
			System.out.println("Enter second number");
			int n1 = scan.nextInt();
			
			try {
				int number = n/n1;
				System.out.println(number);
				
			}
				catch (Exception e) {
					System.out.println("Division by zero is undefined!");
				}
			}
	}
}


//a simple calculator program
package practice;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in);
		double number1, number2, sum;
		System.out.println("Please enter the first number: ");
		number1 = user.nextDouble();
		System.out.println("Enter the second number: ");
		number2 = user.nextDouble();
		sum = number1 +number2;
		System.out.println(" The sum is: "+sum);
	}

}

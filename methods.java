package practice;
import java.util.Scanner;
public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner username = new Scanner(System.in);
		subsidiary simpleObject = new subsidiary();
		
		System.out.println("Enter your name here: ");
		String name = username.nextLine();
		
		simpleObject.sham(name);
	}

}

import java.util.Scanner;

public class UserValidation {
	static Scanner scnr = new Scanner(System.in);
	static int diceSides;
	

	public static void inputValidation() {

		while (!scnr.hasNextDouble()) {
			System.out.print("Please enter numbers only!");
			scnr.next();
		}
	}
	
	public static int getDiceNum() {
		diceSides = scnr.nextInt();
		return diceSides;
	}
}

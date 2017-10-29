import java.util.Scanner;

public class Application {
	static Scanner scnr = new Scanner(System.in);
	public static boolean stopApp() {
		boolean continueApp = true;
		String yesNo;
		yesNo = scnr.next().toLowerCase();
		if (yesNo.equals("n")) {

		System.out.println("Application stopped.");
		scnr.close();
		continueApp = false;
		
		}
		return continueApp;
	}

}

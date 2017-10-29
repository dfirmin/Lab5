
public class Main {

	public static void main(String[] args) {
		boolean continueApp = true;
		System.out.println("Welcome to the Grand Circus Casino!");
		while (continueApp) {
			System.out.println("How many sides should each die have?");
			UserValidation.inputValidation();
			Dice.rollDice(UserValidation.getDiceNum());
			System.out.println("Roll again? (y/n):");
			continueApp = Application.stopApp();

		}
	}

}

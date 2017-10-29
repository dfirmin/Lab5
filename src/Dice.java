
public class Dice {
	
	public static void rollDice(int num) {
		int diceOne;
		int diceTwo;
		int dice[] = new int [2];
		
		diceOne = 1 + (int)(Math.random() * num);
		diceTwo = 1 + (int)(Math.random() * num);
		dice[0] = diceOne;
		dice[1] = diceTwo;
		System.out.println(dice[0]);
		System.out.println(dice[1]);
	}

}

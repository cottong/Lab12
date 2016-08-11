package players;

import java.util.Random;

public class RandomPlayer extends Player {
	public RandomPlayer() {
		setName("Michigan");
	}

	@Override
	public String generateRoshambo() {
		String roshamboValue = "";

		Random randNum = new Random();

		int n = randNum.nextInt(3) + 1;
		if (n == 1) {
			roshamboValue = "rock";
		} else if (n == 2) {
			roshamboValue = "paper";
		} else if (n == 3) {
			roshamboValue = "scissors";
		} else {

		}

		// TODO Auto-generated method stub
		return roshamboValue;
	}

}

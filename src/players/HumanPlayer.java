package players;

import java.util.Scanner;

public class HumanPlayer extends Player {
	public HumanPlayer(String name) {
		setName(name);
	}

	@Override
	public String generateRoshambo() {

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter rock, paper, or scissors:");
		String input = scan1.nextLine();
		input.toLowerCase();
		boolean choice = true;
		while (choice) {
			switch (input) {
			case "rock":
			case "paper":
			case "scissors":

				choice = false;
				break;

			default:
				System.out.println("please enter a valid answer");
				input = scan1.nextLine();
				break;
			}
		}
		return input;
	}

}

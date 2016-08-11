package RoshamboApp;

import java.util.Scanner;

import players.*;

public class MainApp {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scan1.nextLine();
		int tie = 0;
		int wins = 0;
		int losses = 0;
		String choice = "yes";
		while (choice.equalsIgnoreCase("yes")) {

			System.out
					.println("Would you like to play against Michigan or State?");
			String competitor = scan1.nextLine();
			Player p1 = new RandomPlayer();
			Player p2 = new RockPlayer();
			Player p3 = new HumanPlayer(name);
			String answer = "";
			String compName = "";
			String yourAnswer = "";
			Boolean compValid = true;
			while (compValid) {
				if (competitor.equalsIgnoreCase("michigan")) {
					compName = p1.getName();
					answer = p1.generateRoshambo();
					yourAnswer = p3.generateRoshambo();
					System.out.println(p3.getName() + " : " + yourAnswer);
					compValid = false;
				} else if (competitor.equalsIgnoreCase("state")) {
					compName = p2.getName();
					answer = p2.generateRoshambo();
					yourAnswer = p3.generateRoshambo();
					System.out.println(p3.getName() + " : " + yourAnswer);
					compValid = false;
				} else {
					System.out.println("Please enter a valid competitor");
					competitor = scan1.nextLine();
				}
			}
			System.out.println(compName + " : " + answer);

			if (yourAnswer.equalsIgnoreCase(answer)) {
				System.out.println("Its a tie");
				tie++;
			} else if ((yourAnswer.equalsIgnoreCase("rock") && answer
					.equalsIgnoreCase("paper"))
					|| (yourAnswer.equalsIgnoreCase("scissors") && answer
							.equalsIgnoreCase("rock"))
					|| (yourAnswer.equalsIgnoreCase("paper") && answer
							.equalsIgnoreCase("scissors"))) {
				System.out.println("You LOSE!");
				losses++;
			} else if ((yourAnswer.equalsIgnoreCase("rock") && answer
					.equalsIgnoreCase("scissors"))
					|| (yourAnswer.equalsIgnoreCase("scissors") && answer
							.equalsIgnoreCase("paper"))
					|| (yourAnswer.equalsIgnoreCase("paper") && answer
							.equalsIgnoreCase("rock"))) {
				System.out.println("You Win!");
				wins++;
			} else {
				System.out.println("it shouldnt get here");
			}
			System.out.println("Continue? (yes/no)");

			choice = scan1.nextLine();
			if (choice.equalsIgnoreCase("no")) {
				int total = wins + losses + tie;
				System.out.println("Total Plays: " + total  );
				System.out.println("wins:" + wins);
				System.out.println("losses:" + losses);
				System.out.println("ties:" + tie);
			}
		}

	}
}

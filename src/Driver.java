import java.util.Scanner;
import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int numDice = 3, trial = 5;
		int playerPoints = 0, computerPoints = 0;
		System.out.println("Choose your number (between 1 and 6): ");
		int playerTarget = scanner.nextInt();
		Game player = new Game(numDice, trial);
		playerPoints = player.play("Player", playerTarget);
		int computerTarget = random.nextInt(6) + 1;
		System.out.println("Computer's target is " + computerTarget);
		Game computer = new Game(numDice, trial);
		computerPoints = computer.play("Computer", computerTarget);
		
		if(playerPoints > computerPoints) {
			System.out.println("Congrats You Won :)");
		}
		else if (computerPoints > playerPoints) {
			System.out.println("You lost :(");
		}
		else {
			System.out.println("Draw!");
		}

	}

}

import java.util.Random;
import java.util.Scanner;

public class Game {
	int numDice;
	int trial;
	Scanner scanner;
	Random random;
	
	public Game(int numDice, int trial) {
		this.numDice = numDice;
		this.trial = trial;
		scanner = new Scanner(System.in);
		random = new Random();
	}
	
	public int play(String name, int target) {
		int[] dice = new int[numDice];
		int points = 0;
		
		for(int i = 0; i < trial; i++) {
			for(int j = 0; j < numDice; j++) {
				dice[j] = random.nextInt(6) + 1;
			}
			System.out.println("Press Enter: ");
			scanner.nextLine();
			for(int j : dice) {
				System.out.print(j + " ");
				if(j == target) {
					points++;
				}
			}
			System.out.println();
		
		}
		System.out.println(name + " got " + points + " points");
		return points;
	}
}

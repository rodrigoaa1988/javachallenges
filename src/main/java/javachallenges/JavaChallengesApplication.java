package javachallenges;

import java.util.Scanner;

import javachallenges.challengeclasses.IfElseChallenge;
import javachallenges.challengeclasses.ScannerChallenge;
import javachallenges.utils.Title;

public class JavaChallengesApplication {

	public static void main(String[] args) {

		
		
		Scanner scanner = new Scanner(System.in);
		
		int option = 0;

		while (option != 1) {
			Title.showTitle();
			option = scanner.nextInt();
			
			switch (option) {
			case 1 -> option = 1;
			case 2 -> ScannerChallenge.scannerChallenge(scanner);
			case 3 -> IfElseChallenge.ifElseChallenge(scanner);
			default -> option = 0;
			}
		}
		
		scanner.close();
		System.out.println("Thank's");
	}

}

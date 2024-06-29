package javachallenges.challengeclasses;

import java.util.Scanner;

public abstract class ScannerChallenge {

	public static void scannerChallenge(Scanner scanner) {

		System.out.println();
		System.out.println("ENTER THREE INTEGERS:");
		System.out.println();

		int[] intArray = new int[3];

		for (int x = 0; x <= 2; x++) {
			System.out.println("");
			System.out.print("ENTER 3 INTEGERS AND PRINT THEM ON THE SCREEN: ");
			if (scanner.hasNextInt()) {
				intArray[x] = scanner.nextInt();
			} else {
				String input = scanner.next();
				System.out.println("INCORRET FORMAT: \"" + input + "\" IS NOT AN INTEGER");
				scanner.nextLine();
				break;
			}

		}

		System.out.println("");
		System.out.println("RESULT:");
		System.out.println("PRINTING THE INTEGERS:");
		System.out.println("");

		int cont = 1;
		for (int x : intArray) {
			System.out.println(cont + "º GIVEN INTEGER: " + x);
			cont++;
		}

	}

}

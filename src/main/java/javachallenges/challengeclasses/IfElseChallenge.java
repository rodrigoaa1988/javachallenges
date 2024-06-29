package javachallenges.challengeclasses;

import java.util.Scanner;

public abstract class IfElseChallenge {
	
	public static void ifElseChallenge(Scanner scanner) {
		
		
		System.out.println();
		System.out.println("GIVEN AN INTEGER \"N\" PERFORM THE FOLLOWING CONDITIONAL ACTIONS:");
		System.out.println("IF N IS ODD, PRINT Weird");
		System.out.println("IF N IS EVEN AND IN THE INCLUSIVE RANGE OF 2 TO 5. PRINT Not Weird");
		System.out.println("IF N IS EVEN AND IN THE INCLUSIVE RANGE OF 6 TO 20. PRINT Weird");
		System.out.println("IF N IS EVEN AND GREATER THAN 20. PRINT Not Weird");
		System.out.println();
		System.out.print("ENTER THE NUMBER: ");
		
		int n = 0;
		
		if (scanner.hasNextInt()) {
			n = scanner.nextInt();
		} else {
			String input = scanner.next();
			System.out.println("INCORRET FORMAT: \"" + input + "\" IS NOT AN INTEGER");
			scanner.nextLine();
		}
		
		
		System.out.println("");
		System.out.println("RESULT:");
		System.out.println("");
		
		if(n % 2 != 0){
            System.out.println("Weird");
        }else if(n >=2 && n <= 5){
            System.out.println("Not Weird");
        }else if(n >= 6 && n <= 20){
            System.out.println("Weird");
        }else if(n > 20){
            System.out.println("Not Weird");
        }
		
		
	}

}

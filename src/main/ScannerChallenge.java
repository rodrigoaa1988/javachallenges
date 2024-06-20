package main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * In this challenge, you must read 3 integers from stdin and then print them to stdout.
 * Each integer must be printed on a new line.
 */
public abstract class ScannerChallenge {
	
	public static void scannerChallenge() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Basic use of Scanner class to input before print the given integers");
		System.out.println();
		
		try {
			System.out.print("enter the first integer_");
			int firstInt = scanner.nextInt();
			
			System.out.print("enter the second integer_");
			int secondInt = scanner.nextInt();
			
			System.out.print("enter the third integer_");
			int thirdInt = scanner.nextInt();
			
			System.out.println("first integer: " + firstInt);
			System.out.println("second integer: " + secondInt);
			System.out.println("third integer: " + thirdInt);
			
		}catch(InputMismatchException e) {
			System.out.println("Formato incorreto: " + e.getMessage());
		}
		
		scanner.close();
		
	}
	

}

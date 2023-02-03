package Exercices;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {

		int number, inverse;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		number = scanner.nextInt();
		
		inverse = 0;
		
		while (number > 0) {
			inverse = (inverse * 10) + (number % 10);
			number = number / 10;
			
		}
		
		System.out.println("l'inverse est : " + inverse);
	}

}

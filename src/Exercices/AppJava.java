package Exercices;

import java.util.Scanner;

public class AppJava {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int number = scanner.nextInt();
		int value, sum = 0;
		int temp = number;
		
		while (number > 0) {
			value = number % 10;
			number = number / 10;
			sum = sum + (value * value * value);
		}
		if (temp == sum) {
			System.out.println("It is a Armstrong number");
		} else {
			System.out.println("It is not a Armstrong number");
		}

	}

}

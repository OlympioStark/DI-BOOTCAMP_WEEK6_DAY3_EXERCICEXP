package Exercices;

public class PrintStars {

	public static void main(String[] args) {
		String star = "*";

		for (int i = 1; i < 6; i++) {
			System.out.println(star.repeat(i - 1));
		}
	}

}

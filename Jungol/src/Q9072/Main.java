package Q9072;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		for (int i = 1; i <= 10; i++) {
			int input = sc.nextInt();
			sum += input;
			if (i == 10) {
				sc.close();
				avg = (double) sum / i;
				System.out.printf("ÃÑÁ¡ = %d\n", sum);
				System.out.printf("Æò±Õ = %.1f", avg);

			}
		}
	}

}
//ÇÑ±Û ¾È³ª¿Â´Ù.
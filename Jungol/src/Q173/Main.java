package Q173;

import java.util.Scanner;

public class Main {
	public static void Minus(double a, double b) {
		if (a > b) {
			double sum = 0;
			a = Math.pow(a, 2);
			b = Math.pow(b, 2);
			sum = a - b;
			System.out.printf("%.0f", sum);
		} else {
			double sum = 0;
			a = Math.pow(a, 2);
			b = Math.pow(b, 2);
			sum = b - a;
			System.out.printf("%.0f", sum);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();
		Minus(a, b);
	}

}

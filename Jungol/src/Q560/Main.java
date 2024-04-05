package Q560;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int b = 0; // ÃÖ¼Ò°ª

		for (int i = 0; i < a.length; i++) {
			int input = sc.nextInt();
			a[i] = input;
			if (i == 0) {
				b = a[i];
			} else if (a[i] < b) {
				b = a[i];

			} else if (i == 9) {
				sc.close();
				System.out.print(b);
			}
		}

	}
}

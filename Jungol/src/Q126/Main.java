package Q126;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z = 0, x = 0;

		while (true) {
			int a = sc.nextInt();
			if (a == 0) {
				System.out.printf("odd : %d\n", z);
				System.out.printf("even : %d", x);
				sc.close();
				break;
			}
			if (a % 2 == 1) {
				z++; // È¦¼ö
			} else {
				x++; // Â¦¼ö
			}
		}
	}
}
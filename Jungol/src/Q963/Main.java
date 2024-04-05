package Q963;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		square(a);
	}

	public static void square(int a) {
		int sum = 1;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++, sum++) {
				System.out.print(sum + " ");
				if (sum % a == 0) {
					System.out.print("\n");

				}

			}
		}
	}
}

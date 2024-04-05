package Q172;

import java.util.Scanner;

public class Main {
	public static void Square(int a) {
		for (int i = 1; i <= a; i++) {
			int x = 0;
			for (int j = 0; j < a; j++) {
				x = x + i;
				System.out.print(x + " ");
				if (j == a - 1) {
					System.out.print("\n");
				}

			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		Square(a);

	}
}

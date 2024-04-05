package Q9088;

import java.util.Scanner;

public class Main {

	public static void Cal(int x, char y, int z) {
		if (y == '+') {
			System.out.printf("%d %s %d = %d", x, y, z, x + z);
		}
		if (y == '-') {
			System.out.printf("%d %s %d = %d", x, y, z, x - z);
		}
		if (y == '*') {
			System.out.printf("%d %s %d = %d", x, y, z, x * z);
		}
		if (y == '/') {
			System.out.printf("%d %s %d = %d", x, y, z, x / z);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String Y = sc.next();
		int z =sc.nextInt();
		char y=Y.charAt(0);
		sc.close();
		Cal(x,y,z);
	}
}

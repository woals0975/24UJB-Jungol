package Q538;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			System.out.print("number? ");
			// System.out.print(a);
			if (a > 0) {
				System.out.print("positive integer\n");
			} else if (a < 0) {
				System.out.print("negative number\n");

			} else if (a == 0) {
				sc.close();
				break;

			}
		}
	}
}

// if만있으면 걍 false 뜨면 돌아감 
//else if면 끝까지 간다.
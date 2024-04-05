package Q574;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] max = new int[3];
		int Max = Integer.MIN_VALUE;
		for (int i = 0; i < max.length; i++) {
			int a = sc.nextInt();
			max[i] = a;
			if (max[i] >= Max) {
				Max = max[i];
			}
			if (i == max.length-1) {
				System.out.print(Max);

			}

		}
		sc.close();
	}
}

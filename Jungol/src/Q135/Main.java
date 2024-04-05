package Q135;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = 0, d = 0, e = 0; // 큰거 작은거 나온항목 개수
		int sum = 0;

		if (a < b) {
			c = a;
			d = b;
		} else {
			c = b;
			d = a;
		}
		for (int i = c; i <= d; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
				e++;
			}
			if (i == d) {
				sc.close();
				double avg = (double) sum / (double) e;
				System.out.printf("sum : %d\n", sum);
				System.out.printf("avg : %.1f", avg);
			}

		}

	}
}

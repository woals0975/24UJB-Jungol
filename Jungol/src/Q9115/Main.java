package Q9115;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		char[] output = new char[input.length()];
		int[] B = new int[input.length()];
		for (int i = 0; i < input.length(); i++) {
			output[i] = input.charAt(i);
			char[] A = new char[input.length()];
			if (i == (input.length() - 1)) {
				for (int j = 0; j < input.length(); j++) {
					B[j] = output[j];
					if (B[j] < 123 && B[j] > 96) {
						B[j] = B[j] - 32;
					} else if (B[j] < 91 && B[j] > 64) {
						B[j] = B[j] + 32;
					}
					if (j == input.length() - 1) {
						for (int k = 0; k < input.length(); k++) {
							A[k] = (char) B[j];

						}
					}

				}
			}
		}
	}

}

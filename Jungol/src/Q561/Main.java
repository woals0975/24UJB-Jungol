package Q561;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int B = 0; // 100�̸��� ���� ū ��
		int C = 0; // 100�̻��� ���� ������
		for (int i = 0; i < 10; i++) {
			int input = sc.nextInt();
			a[i] = input;
			if (input < 100 && B == 0) { // ù��°�� �Է�
				B = input;
			}
			if (input < 100 && B != 0) {
				if (input > B) {
					B = input;
				}
			}
			if (input > 100 && C == 0) { // ù��°�� �Է�
				C = input;
			}
			if (input > 100 && C != 0) {
				if (input < C) {
					C = input;
				}
			}
			if (i == 9) { // ���������� ���� ���ٸ� 100�� �Է�
				if (B == 0) {
					B = 100;
				}
				if (C == 0) {
					C = 100;
				}
				sc.close();
				System.out.print(B + " ");
				System.out.print(C);
			}

		}
	}
}

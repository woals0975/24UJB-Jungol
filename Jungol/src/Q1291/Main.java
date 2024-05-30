package Q1291;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int f = sc.nextInt(); // 처음
			int l = sc.nextInt(); // 끝
			if (1 < f && 10 > f && 1 < l && 10 > l) { // 범위는 2~9
				for (int i = 1; i < 10; i++) { // 구구단이니까 1~9
					if (f > l) { // 시작 범위가 더 크거나 같을때
						for (int j = f; j >= l; j--) { // 여기에 같은거 포함시킴 밑에 포함시켜도 무관
							System.out.printf("%d * %d = %2d   ", j, i, j * i); // 2~9니까 결과값만 2칸으로 정렬
							if (j == l) {
								System.out.println();
							}
						}
					} else if (f <= l) { // 시작 범위가 더 작을떄
						for (int j = f; j <= l; j++) {
							System.out.printf("%d * %d = %2d   ", j, i, j * i);
							if (j == l) {
								System.out.println();
							}
						}
					}
				}
				sc.close();
				break;
			} else {
				System.out.println("INPUT ERROR!");
			}

		}
	}
}

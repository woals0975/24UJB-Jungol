package Q615;

import java.util.Scanner;

class student {
	private String name;
	private int korea;
	private int english;

	public student(String name, int korea, int english) {
		this.name = name;
		this.korea = korea;
		this.english = english;
	}

	public void print() {
		System.out.printf("%s %d %d\n", name, korea, english);

	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sk = 0;
		int se = 0;
		for (int i = 0; i < 2; i++) {
			String name = sc.next(); //이름	
			int korea = sc.nextInt(); //국어점수
			int english = sc.nextInt(); //영어점수
			sk = sk + korea;
			se = se + english;
			if (i == 0) {
				student J = new student(name, korea, english);
			J.print();
			}
			if (i == 1) {
				student S = new student(name, korea, english);
				S.print();
				sk = sk / 2; // 국어 평균
				se = se / 2; // 영어 평균

				System.out.printf("avg %d %d", sk, se);
				sc.close();

			}
		}
	}
}

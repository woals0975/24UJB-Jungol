package Q572;

import java.util.Scanner;

public class Main {

	public static void R(int r) {  //static 쓰면 맨 마지막에 레퍼런스 안만들어도 ㄱㅊ
		double R = 0;
		R = r * r * 3.14;
		System.out.printf("%.2f", R);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		R(r);
	}

}

package Q983;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Bab(a, b);
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		Sab(c, d);
	}

	public static void Bab(int a, int b) {
		if (Math.abs(a) > Math.abs(b)) {
			System.out.print(a+"\n");
		} else {
			System.out.print(b+"\n");
		}
	}

	public static void Sab(double c, double d) {
		if (Math.abs(c) > Math.abs(d)) {
			System.out.printf("%.2f\n",d);
		} else {
			System.out.printf("%.2f\n",c);
		}
	}

}

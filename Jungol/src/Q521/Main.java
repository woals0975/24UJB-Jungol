package Q521;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a++;
		--b;
		sc.close();
		System.out.printf("%d %d %d",a,b,c*b);
	}
}

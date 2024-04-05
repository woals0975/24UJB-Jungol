package Q597;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		String a = sc.next();
		String b = sc.next();
		sc.close();
		int A = (int)a.length();
		int B = (int)b.length();
		int C = A+B;
		System.out.print(C);
	}

}

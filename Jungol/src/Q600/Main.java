package Q600;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		sc.close();
		String[] a = in.split(" ");
		System.out.print(a.length);
	}

}

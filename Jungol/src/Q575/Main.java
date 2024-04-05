package Q575;

import java.util.Scanner;

public class Main {
	
	public static void S(int x,int y) {
		double sum = 0;
		sum =Math.pow(x, y);
		System.out.printf("%.0f",sum);
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		sc.close();
		S(x,y);
	}
}

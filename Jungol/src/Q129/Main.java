package Q129;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// char c = '\0' c를 null로 초기화
		while(true) {
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = (a*b)/2;
		System.out.printf("Base = ");
		System.out.printf("Height = ");
		System.out.printf("Triangle width = %.1f\n", c);
		System.out.print("Continue?");
		String d =sc.next();
		System.out.print(" ");
		if(d.equals("Y") || d.equals("y")) {
			
		}else {
			sc.close();
			 break;
		}
			
		}
	}
	
}
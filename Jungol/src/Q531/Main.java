package Q531;

import java.util.Scanner;
//     java.util.*; (모든 자바 유틸을 가져와라)

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		sc.close();
		if(a <= 50.80) {
			System.out.print("Flyweight");
		}
		
		else if(a <= 61.23) {
			System.out.print("Lightweight");
	
		}
		else if(a<= 72.57) {
			System.out.print("Middleweight");
	
		}
		else if(a <= 88.45) {
			System.out.print("Cruiserweight");
		
		}
		else if(a > 88.45) {
			System.out.print("Heavyweight");
	
		}
	}
}

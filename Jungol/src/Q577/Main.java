package Q577;

import java.util.Scanner;

public class Main {
	
	public static void sum(int a, int b) {
		if(a>b) {
			a=a/2;
			b=2*b;
			System.out.printf("%d %d",a,b);
		}else {
			b=b/2;
			a=a*2;
			System.out.printf("%d %d",a,b);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt(), b = sc.nextInt();
		sc.close();
		sum(a,b);
	}
}

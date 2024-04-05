package Q136;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b=10*a;
		
		for(int i=a;i<=b;i=i+a) {
			System.out.print(i+" ");
		}
		sc.close();
		
	}

}

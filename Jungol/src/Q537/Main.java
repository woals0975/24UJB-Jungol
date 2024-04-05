package Q537;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int sum = 0;
		int i= 1; 
		do {
			sum+= i;
		} while (i++<a);
		
		System.out.print(sum);

	}
}


/*
 * int sum = 0; 
 * for(int i = 1 ; i<= a; i++) { 
 * sum += i; 
 * }
 * 
 * int sum = 0;
		int i = 1;
		while(i<=a) {
			sum += i++;
		}
 */
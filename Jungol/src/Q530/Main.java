package Q530;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		if(a>=20) {
			System.out.print("adult\n");
			
		}else { 
			System.out.printf("%d years later",20-a);
		}
	}
	
}

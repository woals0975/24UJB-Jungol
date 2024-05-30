package Q634;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i>=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				if(j==num) {
					System.out.println();
				}
				
			}
		}
	}
}

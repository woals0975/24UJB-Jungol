package Q550;

import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		for(int i=0; i<in;i++) {
				for(int j=0; j<in;j++) {
					if(j>=i) {
						System.out.print("*");
					}
					if(j==in-1) {
						System.out.println();
					}
				}
		}
			for(int i=0; i<in;i++) {
					for(int j=0; j<in;j++) {
						if(j<=i) {
							System.out.print("*");
						}
						if(j==in-1) {
							System.out.println();
						}
					}
			}
	}

}

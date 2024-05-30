package Q1303;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 1;
		int d = 0;
		for(int i= 0; i<a; i++) {
			for(int j=0; j<b; j++,d++) {
				System.out.print(c+d+" ");
				if(j==b-1) {
					System.out.print("\n");
				}
			}
		}
	}

}

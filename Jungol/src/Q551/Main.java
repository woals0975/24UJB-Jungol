package Q551;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i =0; i<a;i++) {
			for(int j=0;j<a;j++) {
				if(j>=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				if(j==a-1) {
					System.out.println();
				}
			}
		}
	}

}

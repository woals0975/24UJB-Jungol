package Q9058;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		sc.close();
		for(int i=0;i<in;i++) {
			for(int j=in-1;j>=0;j--) {
				if(j<=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				if(j==0) {
					System.out.println();
				}
			}
		}
	}
}

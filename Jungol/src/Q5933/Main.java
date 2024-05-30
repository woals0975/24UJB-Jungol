package Q5933;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1; i<=a; i++) {
			int b = 1;
			for(int j=0; j<a; j++,b++) {
				System.out.print(i*b +" ");
				if(j==a-1) {
					System.out.println();
				}
			}
		}
	}

}

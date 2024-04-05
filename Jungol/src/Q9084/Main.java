package Q9084;

import java.util.Scanner;

public class Main {
	
	public static void Star(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
				if(i==j) {
					System.out.print("\n");
					break;
				}else if(j==n) {
					break;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		Star(n);
	}
}

package Q544;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum  = 0;
		sc.close();
		for(int i=a;i<=100;i++) {
			sum = sum+i;
			if(i==100) {
				System.out.print(sum);
				break;
			}
			
			
		}
	}

}

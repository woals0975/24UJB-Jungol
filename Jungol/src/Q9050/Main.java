package Q9050;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum  = 0;
		sc.close();
		for(int i=0;i<=a;i++) {
			sum = sum+i;
			if(i==a) {
				System.out.print(sum);
				break;
			}
			
			
		}
	}

}

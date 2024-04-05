package Q133;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum=0;
		
		for(int i=1;i<=n;i++) {
		int a =sc.nextInt();
		sum+=a;
		if(i==n) {
		sc.close();
		double avg = (double)sum/n;
		System.out.printf("%.2f",avg);
		}
		}
		
	}

}

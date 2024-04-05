package Q627;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] z = new double[10];
		for(int i=0;i<10;i++) {
		double a = sc.nextDouble();
		z[i] = a;
		}
		System.out.printf("%.1f",(z[0]+z[9])/2);
	}
}

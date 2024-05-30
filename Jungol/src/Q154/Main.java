package Q154;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		double[] a =new double[6];
		double sum=0;
		for(int i=0; i<a.length;i++) {
		double in =	sc.nextDouble();
		sum+=in;
		}
		double avg = 0;
		avg = sum/a.length;
		System.out.printf("%.1f",avg);
		

	}

}

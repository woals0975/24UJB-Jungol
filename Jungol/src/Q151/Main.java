package Q151;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] b = new int [5];
		for(int i=0;i<5;i++) {
		int a =sc.nextInt();
		b[i]=a;
		}
		sc.close();
		System.out.printf("%d",b[0]+b[2]+b[4]);
	
	}

}

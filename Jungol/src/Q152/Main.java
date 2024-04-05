package Q152;

import java.util.Scanner;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for(int i=0;i<10;i++) {
			int b = sc.nextInt();
			a[i] =b;
		}
		sc.close();
		Cal(a);
	}

	
	
	
	public static void Cal(int[] a) {
		int odd=0, even=0;
		for(int i=0;i<10;i++) {
			if(i%2!=0) {
			even+=a[i];
			}else {
			odd+=a[i];
			}
			if(i==9) {
				System.out.println("odd : "+odd);
				System.out.print("even : "+even);
			}
		}
	}
}

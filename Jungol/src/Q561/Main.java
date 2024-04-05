package Q561;

import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int B = 0; //100미만의 가장 큰 수
		int C = 0; //100이상의 가장 작은수
		for(int i=0;i<10;i++) {
			int input = sc.nextInt();
			a[i]= input;
		if(input<100 && B==0) {
			B=input;
		}
		if(input<100 && B!=0) {
			if(input>B) {
				B=input;
			}else {
		}
		}
		if(input>100 && C==0) {
			C=input;
		}
		if(input>100 && C!=0) {
			if(input<C) {
				C=input;
			}else {
			}
		}
		if(i==9) {
			if(B==0) {
				B=100;
			}
			if(C==0) {
				C=100;
			}
			sc.close();
			System.out.print(B+" ");
			System.out.print(C+" ");
		}
		
	
	}
	}
}



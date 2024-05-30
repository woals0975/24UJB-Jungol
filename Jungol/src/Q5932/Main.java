package Q5932;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b[] = new int[a];
		int c = 1;
		for(int i=0; i<a;i++,c++) {
			b[i]=c;
		}
		for(int i =0; i<a; i++) {
			int d = a-1;
			for(int j=0; j<a;j++) {
				if(i%2==0) { //홀수
					System.out.print(b[j]+ " ");
				}else {
					System.out.print(b[d]+" ");
					d--;
				}
				if(j==a-1) {
					System.out.println();
				}
			}
		}
	}

}

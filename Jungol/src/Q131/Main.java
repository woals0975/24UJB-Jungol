package Q131;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0, d = 0;
		if(a<b) {          //c에 작은수
			c=a;
		}else {
			c=b;
		}
		if(a>b) {         // d에 큰수
			d=a;
		}else {
			d=b;
		}
		

		for(int i=c;i<=d;i++) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}

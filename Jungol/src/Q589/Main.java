package Q589;

import java.util.Scanner;

public class Main {
	
	public static void plus(int a,int b) {
		
		b+=a;
		a--;
		
		if(a==0) {
		System.out.print(b);
		}else {
			plus(a,b);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		plus(a,b);
		
	}
}

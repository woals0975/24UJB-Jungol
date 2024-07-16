package Q588;

import java.util.Scanner;

public class Main {
	
	
	public static void re(int a) {
		if(a!=0) {
			System.out.printf("%d ", a);
			a--;
			re(a);
		}else {
			
		}
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		re(a);
	}

}

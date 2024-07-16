package Q9102;

import java.util.Scanner;

public class Main {
	
	public static void re(int a,int b) {
		if(a>=b) {
			System.out.printf("%d ",b);
			b++;
			re(a,b);
		}else {
			
		}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 1;
		
		re(a,b);
	}
}

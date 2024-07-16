package Q587;

import java.util.Scanner;

public class Main {
			
	
	
	public static void re(int a) {
		System.out.println("recursive");
		a--;
		
		if(a!=0) {
		re(a);
		}else {
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		re(a);
	}
}

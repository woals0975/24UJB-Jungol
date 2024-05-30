package Q576;

import java.util.Scanner;

public class Main {
	
	
	public static void print(int a,String b , int c) {
		if(b.equals("+")) {
			System.out.printf("%d %s %d = %d",a,b,c,a+c);
		}else if(b.equals("-")) {
			System.out.printf("%d %s %d = %d",a,b,c,a-c);
		}else if(b.equals("*")) {
			System.out.printf("%d %s %d = %d",a,b,c,a*c);
		}else if(b.equals("/")) {
			System.out.printf("%d %s %d = %d",a,b,c,a/c);
		}else {
			System.out.printf("%d %s %d = %d",a,b,c,0);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		int c = sc.nextInt();
		
		print(a,b,c);
		
	}

}

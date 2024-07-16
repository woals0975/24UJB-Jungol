package Q9103;

import java.util.Scanner;

public class Main {
	
	public void fa(int a,int b) {
		a=a*b;
		b--;
		
		if(b!=1) {
			fa(a,b);
		}else {
			System.out.print(a);
		}
		
		
	} 
	
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a-1;
		sc.close();
		Main fa = new Main();
		fa.fa(a,b);
		
		
	}
}

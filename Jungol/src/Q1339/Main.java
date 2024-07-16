package Q1339;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String[] al = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		int x = 1;
		int n=0;
		int z = 1;  //첫항 번호
		if(a>1) {
			
			for(int i=1; i<=a-1;i=i+2) {
				z= z+i;
			}
		}
		
		for(int i=0; i<a; i++) {
			if(a==1) {
				System.out.print("A"); // 1일떄 끝
				break;
			}
			for(int j=0; j<a; j++) {
				
			}
		}
		
	}
}
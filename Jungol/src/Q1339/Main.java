package Q1339;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = (a/2)+1;
		int b2 = (a/2);
		int c = 1;
		int d = (2*c)-1;  //첫항
		String[] al = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		for(int i=0; i<b; i++) {
			for(int j=0; j<b; j++) {
				if(i>=j) {
				System.out.print(1+" ");
				}
				if(j==b-1) {
					System.out.println();
				}		
			}
		}
	
		for(int i=0; i<b2; i++) {
			for(int j=0; j<b2; j++){
				if(i<=j) {
					System.out.print(1+" ");
				}
				if(j==b2-1) {
					System.out.println();
				}
             }
		}
	}
}
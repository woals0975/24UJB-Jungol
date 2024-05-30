package Q1307;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		
		int c= a*a-1;  // 0 ~ 마지막 인덱스
		String[] al = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		for(int i=0; i<a;i++,c--) {
			int b= 0;
			for(int j=0; j<a;j++,b=b+a) {
			System.out.print(al[(c-b)%26]+ " " );
			if(j==a-1) {
				System.out.println();
			}
			
	}
			}
	}
}

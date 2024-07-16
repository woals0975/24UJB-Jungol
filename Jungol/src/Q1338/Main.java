package Q1338;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int f = 0;
		int l = a-1;
		int s = 0;// 다음 행 넘어갔을때 첫값
		String[] al = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		for(int i=0;i<a;i++) {
			f=s;
			s++;
			l=a-1;
			
			for(int j=a-1;j>=0;j--) {
				if(i<j) {
					System.out.print("  ");
				}else {
					if(i==j) {
						System.out.print(al[(f)%26]+" ");	
					}else {
					System.out.print(al[(f+l)%26]+" ");
					f=f+l;
					l--;
					}
				}
				if(j==0) {
					System.out.println();
				}
			}
		}
	}

}

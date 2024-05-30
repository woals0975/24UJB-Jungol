package Q1314;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String[] al = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		int b = a*a-1 ; //마지막 인덱스 
		int c = 0;  //첫 시작
		int d=0;  // 짝수행에서 밑으로 1씩 빼줄거
		for(int i=0;i<a;i++,c++) { 
			d++;
			int e=0; //2의 배수
			for(int j=0;j<a;j++) {
				if(j%2==0) {//홀수행
				System.out.print(al[(c+e*a)%26] +" ");
				e=e+2;
				}else {
				System.out.print(al[(e*a-d)%26] +" ");
				}
				if(j==a-1) {
					System.out.println();
				}  
			}
		}
	}
}

package Q546;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double n = sc.nextInt(); //과목수
		double sum =0;
		for(int i=1; i<=n;i++) {
		int a = sc.nextInt(); //과목별 점수		
		sum = sum+a;
		if(i==n) {
			double avg = sum/n;
			System.out.printf("avg : %.1f\n",avg);
			if(avg>=80) {
				System.out.print("pass");	
			}else {
				System.out.print("fail");
			}
		}
		
		
		}
		sc.close();
	}

}

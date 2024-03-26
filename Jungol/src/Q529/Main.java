package Q529;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();  //虐
		int W = sc.nextInt();  //个公霸
		int a = W+100-H;      //个公霸+100-虐
		sc.close();
		
		System.out.printf("%d\n",a);
		if(a>0) {
			System.out.print("Obesity");
		}
		
		
		
	}

}

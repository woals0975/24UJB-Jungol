package Q529;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();  //Ű
		int W = sc.nextInt();  //������
		int a = W+100-H;      //������+100-Ű
		sc.close();
		
		System.out.printf("%d\n",a);
		if(a>0) {
			System.out.print("Obesity");
		}
		
		
		
	}

}

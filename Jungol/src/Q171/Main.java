package Q171;

import java.util.Scanner;

public class Main {
	 public static void Sum(int a) {
		int sum = 0;
		for(int i=1;i<=a;i++) {
		sum+=i;
		if(i==a) {
			System.out.print(sum);
		}
		}
	 }
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		Sum(a);
	}
	}



package Q573;

import java.util.Scanner;

public class Main {

	public static void num(int n) {
	for(int i=1;i<=n*n;i++) {
		if(i%n!=0) {
		System.out.print(i+" ");
		}else if(i%n==0) {
		System.out.print(i+"\n");
		}	
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		num(n);
		
	}
	}


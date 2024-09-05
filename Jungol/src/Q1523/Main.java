package Q1523;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		out:
		for( ; ; ) {
			
			if(a>100 || a<0) {
				System.out.println("INPUT ERROR!");
				break out;
			}
			
			if(b==1 || b==2 || b==3) {
			
		if(b==1) {
			
			for(int i=0;i<a;i++) {
				for(int j=0;j<a;j++) {
					if(j<=i) {
						System.out.print("*");
					}
					if(j==i) {
						System.out.println();
					}
				}
				if(i==a-1) {
					break out;
				}
			}
		}
		
			if(b==2) {
				
				for(int i=a-1;i>=0;i--) {
					for(int j=0;j<a;j++) {
						if(j<=i) {
							System.out.print("*");
						}
						if(j==i) {
							System.out.println();
						}
					}
					if(i==0) {
						break out;
					}
				}
			}
			
			
			if(b==3) {
				a=2*a-1;
				int before = 0;
				int after = 0;
				int half = (a/2)+1;
				for(int i=1;i<=a;i++) {
					for(int j=1;j<=a;j++) {
						if(j>=half-before && j<=half+after) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
						
						if(j==a) {
							System.out.println();
							after++;
							before++;
						}
					}
					if(before==half) {
						break out;
					}
				}
				
			}
			
			
		}else {
			System.out.println("INPUT ERROR!");
			break out;
		}
		}
		}
	}


package Q1430;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = a*b*c;
		String[] num = {"0","1","2","3","4","5","6","7","8","9"};
		String[] x2 = Integer.toString(x).split("");
		
		
		for(int i=0; i<num.length;i++) {
			int z = 0;
			for(int j=0; j<x2.length; j++) {
				if(num[i].equals(x2[j])) {
					z++;
				}
				if(j==x2.length-1) {
					System.out.println(z);
					}
				}
			}			
		}
	}



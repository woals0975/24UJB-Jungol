package Q617;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] a = new String[5];
		int[] b = new int [5];
		int[] backup = new int [5];
		for(int i=0; i<5;i++) {
		String name = sc.next();
		int tall =sc.nextInt();
		a[i]=name;
		b[i]=tall;
		backup[i]=tall;
		}
		sc.close();
		Arrays.sort(b);
		
		for(int i=0;i<a.length; i++) {
			if(b[0]==backup[i]) {
				System.out.printf("%s %d",a[i],b[0]);
			}
		}		
}
}

	
	
	/*class student {
	private String[] name;
	private int[] height;
	private int[] backup;

		public student(String []a,int[] b,int[] c) {
			this.name = a;
			this.height = b;
			this.backup = c;
		}
		public static void select(String []a,int[] b, int[] c) {
			for(int i=0;i<b.length;i++) {
				if(b[0]==c[i]) {
					System.out.printf("%s %d",a[i],b[0]);
				}
			}
			
		}*/

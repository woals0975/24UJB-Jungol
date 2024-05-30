package Q153;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[100];
		int s = 0;
		while(true) {
		for(int i=0; i<100;i++,s++) {
			int in = sc.nextInt();
			a[i] =in;
			
			if(in==-1) {
				for(int j=s;j>=0;j--) {
				
					if(s>=3) {
						System.out.print(a[j-3]+" ");
						System.out.print(a[j-2]+" ");
						System.out.print(a[j-1]);
						return;
					}else if(s==2){
					System.out.print(a[j-2]+" ");
					System.out.print(a[j-1]);
					return;
					}else if(s==1) {
					System.out.print(a[j-1]);
					return;
					}
				}
			}
		}
		}
	}
}




		


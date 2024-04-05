package Q578;

import java.util.Scanner;

public class Main {
	
	
	public static void Multiply(int a, int b) {
		if(a>=b) {
			for(int i=b;i<=a;i++) {
			System.out.printf("== %ddan ==\n",i);
			for(int j=1;j<10;j++) {
			System.out.printf("%d * %d = %2d\n",i,j,i*j);
			if(j==9) {
				System.out.print("\n");
				}
			}
			
			}
		}
		if(a<b) {
			for(int i=a;i<=b;i++) {
			System.out.printf("== %ddan ==\n", i);
			for(int j=1;j<10;j++) {
			System.out.printf("%d * %d = %2d\n",i,j,i*j);
			if(j==9) {
			System.out.print("\n");
			}
			}	
			}
		}
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		Multiply(a,b);
	}
}
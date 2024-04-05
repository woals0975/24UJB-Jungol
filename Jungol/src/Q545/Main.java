package Q545;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z=0;    //3น่
		int x=0;	//5น่
		for(int i=0; i<10; i++) {
		int a =sc.nextInt();
		if(a%3==0) {
			z++;
		}
		if(a%5==0) {
			x++;
		}
		if(i==9) {
			sc.close();
			System.out.printf("Multiples of 3 : %d\n",z);
			System.out.printf("Multiples of 5 : %d",x);
			
		}
		}
	}

}

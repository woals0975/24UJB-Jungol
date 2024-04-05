package Q626;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		int c = 0, d=0, sum=0;
		if(a<b) {
			c=a;
		}else { 
			c=b;
		}
		if(a>b) {
			d =a;
		}else {
			d=b;
		}
		for(int i=c;i<=d;i++) {
			sum+=i;
		}
		sc.close();
		System.out.print(sum);
		
	}

}

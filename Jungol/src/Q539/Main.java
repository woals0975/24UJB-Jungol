package Q539;

import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {
		int count = 0, sum =0;
		//개수 와 합
		Scanner sc = new Scanner(System.in);
		while(true) { // for ( ; ; ) 이것도 무한루프
		int a = sc.nextInt();
		count++; //1씩늘려
		sum += a; // sum = sum + a
		if(a>=100) {
			sc.close();
		System.out.println((int)sum);
		System.out.printf("%.1f\n",(double)sum/count);
			break;			
		}
		
		}
		
		
			
	}

}

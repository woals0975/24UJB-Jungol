package Q129;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(true) {
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = (a*b)/2;
		System.out.printf("Base = %.0f\n",a);
		System.out.printf("height = %.0f\n",b);
		System.out.printf("Triangle width = %.1f\n",c);
		System.out.print("Continue?");
		String z = sc.next();
		char x = z.charAt(0);
		if(x=='Y'||x=='y') {	
		}else { 
			sc.close();
			break;
		}
		
		//예제 출력에는 줄바꿈 있는데 정답에는 없음
	
			
		}
		
	}

}

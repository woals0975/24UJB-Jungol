package Q110;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.print("yard? ");
		double a = sc.nextDouble();
		double b= 91.44;
		System.out.printf("%.1fyard = %.1fcm",a,a*b);
		
		System.out.println();
		sc.close();	
	}
}
//sysout+컨쉬 space 자동완성
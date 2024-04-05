package Q128;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int z = 0;
		
		while(true) {
		int a = sc.nextInt();
		
		if(a==0) {
			System.out.print(z);
				sc.close();
				break;
			}
		z++;
		if(a%3==0) {
			z--;
		}
		else if(a%5==0) {
			z--;
		}
		
		
			
		}
	}
}
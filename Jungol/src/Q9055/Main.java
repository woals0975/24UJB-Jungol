package Q9055;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum =0;
		for(int i=1; ;i++) {
			sum+=i;	
			if(sum>num) {
				System.out.print(i + " " + sum);
				sc.close();
				break;
			}
		}
		
	}

}

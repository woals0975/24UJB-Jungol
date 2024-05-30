package Q549;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0, j=1;
		int num = sc.nextInt();
		for(int i=1; ;i=i+2,j++) {
			sum+=i;
			if(sum>=num) {
				System.out.print(j+" "+sum);
				sc.close();
				break;
				
			}
		}
	}

}

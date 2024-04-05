package Q134;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int even = 0, odd = 0;   //Â¦¼ö È¦¼ö
		
		for(int i=1;i<=10;i++) {
		int a = sc.nextInt();
		if(a%2==0) {
			even++;
		}else {
			odd++;
		}
		if(i==10) {
			sc.close();
			System.out.printf("even : %d\n",even);
			System.out.printf("odd : %d",odd);
		}
		}
	}

}

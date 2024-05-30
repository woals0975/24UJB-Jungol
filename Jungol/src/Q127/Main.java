package Q127;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int i=0;
		while(true) {
			int a = sc.nextInt();	
			if(a>100 || a<0) {
				sc.close();
				double avg =(double)sum/(double)i;
				System.out.printf("sum : %d\n",sum);
				System.out.printf("avg : %.1f",avg);
				break;
						
			}else {
			sum+=a;
			i++;
		
		
				
			}
		
		}

	
}
}


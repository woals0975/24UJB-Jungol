package Q562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sume =0, suma=0; //e Â¦¼ö a È¦¼ö
		double avga=0;
		for(int i=1 ;i<=10;i++){
		int input = sc.nextInt();
		if(i%2==1) { //È¦¼ö
			suma+=input;
		}else if(i%2==0) {
			sume+=input;
		}
		if(i==10) {
			sc.close();
			avga = (double)suma/(i/2);
			System.out.printf("sum : %d\n",sume); //Â¦¼öÀÇÇÕ
			System.out.printf("avg : %.1f",avga); //È¦¼öÀÇÆò±Õ
		}
		
		}
		
		
		
	}

}

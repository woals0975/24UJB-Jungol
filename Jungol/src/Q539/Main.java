package Q539;

import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {
		int count = 0, sum =0;
		//���� �� ��
		Scanner sc = new Scanner(System.in);
		while(true) { // for ( ; ; ) �̰͵� ���ѷ���
		int a = sc.nextInt();
		count++; //1���÷�
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

package Q534;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	//	char c = sc.next().charAt(0);  �̰� ���
		
		String a = sc.next();
		char c = a.charAt(0);
		
		if(c == 'A') { //char�� ' ' == ��� ���� String �̸� == �Ұ� esquals���
		System.out.print("Excellent");
		}
		else if(c=='B') {
			System.out.print("Good");
		}
		else if(c=='C') {
			System.out.print("Usually");
		}
		else if(c=='D') {
			System.out.print("Effort");
		}
		else if(c=='F') {
			System.out.print("Failure");
		}
		else {
			System.out.print("error");
		}
		sc.close();
			
		
	}

}

   

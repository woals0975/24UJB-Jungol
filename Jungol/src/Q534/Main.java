package Q534;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	//	char c = sc.next().charAt(0);  이거 써라
		
		String a = sc.next();
		char c = a.charAt(0);
		
		if(c == 'A') { //char면 ' ' == 사용 가능 String 이면 == 불가 esquals사용
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

   

package Q596;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(); // 입력 스트링
		int b = sc.nextInt(); // 입력 정수
		int c = a.length(); // 스트링의 길이
	
		sc.close();
		
		for(int i=c-1; i>=c-b ; i--) {
			//길이-1   길이-정수   -1씩감소
		char d =a.charAt(i);
		System.out.print(d);
		if(i==0)//음수X
			break;
		}
		
	
	
		
		
	}

}



package Q598;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String a = sc.next();
			char b = a.charAt(0);
			int d = b; // char값을 int 값으로
			
			if (b >= 65 && b<=90) { //대문자 'A' 'Z'도 가능  character.isAlphabetic() 알파벳확인
				System.out.println(a); // 알파벳이면 그대로
			} else if (b >= 97 && b<=122) { //소문자 'a' 'z'도 가능
				System.out.println(a);
			} else if (b >= 48 && b <= 57) { // 아스키코드로 확인해본후 숫자면 숫자에 맞는 아스키코드 출력
				System.out.println(d);  	//character.isDigit()  숫자인지 확인 
				} else {
				sc.close();
				break;
			}

		}
	}
}

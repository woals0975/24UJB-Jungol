package Q9022;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = b--;
		a++;
		sc.close();	
		System.out.printf("a= %d, b = %d, c = %d",a,b,a+c);
	}
}


//정수 변수 a와 b를 입력받아서 
//a는 전치 증가 연산자를 사용하고,
//b는 후치 감소 연산자를 사용하여
//두 수의 합을 c에 저장한 후 각각을 
//출력하는 프로그램을 작성하시오.

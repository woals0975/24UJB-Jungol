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


//���� ���� a�� b�� �Է¹޾Ƽ� 
//a�� ��ġ ���� �����ڸ� ����ϰ�,
//b�� ��ġ ���� �����ڸ� ����Ͽ�
//�� ���� ���� c�� ������ �� ������ 
//����ϴ� ���α׷��� �ۼ��Ͻÿ�.

package Q598;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String a = sc.next();
			char b = a.charAt(0);
			int d = b; // char���� int ������
			
			if (b >= 65 && b<=90) { //�빮�� 'A' 'Z'�� ����  character.isAlphabetic() ���ĺ�Ȯ��
				System.out.println(a); // ���ĺ��̸� �״��
			} else if (b >= 97 && b<=122) { //�ҹ��� 'a' 'z'�� ����
				System.out.println(a);
			} else if (b >= 48 && b <= 57) { // �ƽ�Ű�ڵ�� Ȯ���غ��� ���ڸ� ���ڿ� �´� �ƽ�Ű�ڵ� ���
				System.out.println(d);  	//character.isDigit()  �������� Ȯ�� 
				} else {
				sc.close();
				break;
			}

		}
	}
}

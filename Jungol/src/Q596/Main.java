package Q596;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(); // �Է� ��Ʈ��
		int b = sc.nextInt(); // �Է� ����
		int c = a.length(); // ��Ʈ���� ����
	
		sc.close();
		
		for(int i=c-1; i>=c-b ; i--) {
			//����-1   ����-����   -1������
		char d =a.charAt(i);
		System.out.print(d);
		if(i==0)//����X
			break;
		}
		
	
	
		
		
	}

}



package Q155;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = { 'J', 'U', 'N', 'G', 'O', 'L' };
		outer: while (sc.hasNext()) { // ������ �Է¹��� ���� �ִ°�? ������ ���� ������ ����
			String in = sc.next(); // ���� ���Ͱ��� ���ϸ� ��Ÿ�ӿ��� �߻�
			char ch = in.charAt(0);
			for (int i = 0; i < a.length; i++) {
				if (a[i] == ch) {
					System.out.print(i);
					continue outer;
				} else if ((i == a.length - 1) && a[i] != ch) {
					System.out.print("none");
					break outer;
				}
			}
		}
		sc.close();
	}
}

//		outer: // �ݺ��� �տ� �̸��� �ٿ��ش�
//		while (true) {
//			String in = sc.nextLine();
//			char in2 = in.charAt(0);
//			for (int i = 0; i < a.length; i++) {
//				if (a[i] == in2) {
//					System.out.print(a[i]);
//					continue outer;  //�̷��� �ϸ� while ������������ �̵���
//				} else if (i == a.length - 1 ) {
//					System.out.print("none");
//					break outer;
//				}
//			}
//		}
//
//	}
//}

package Q601;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(); 
		sc.close();
		String[] cut = a.split(""); 

		for (int i = 0; i < cut.length; i++) {
			String back[] = Arrays.copyOf(cut, cut.length); // �迭 ����
			for (int j = 0; j < cut.length; j++) {
				if (j + 1 < cut.length) { // ������ �ε������ܸ� ��ĭ �ű�
					cut[j + 1] = back[j];
				} else if (j + 1 == cut.length) {
					cut[0] = back[cut.length - 1]; // 0���͵����� ������ ����ص� ������ �ε����� ����
				}
				if (j == cut.length - 1) {
					String Join = String.join("", cut); // �迭�� ""(�������)�� ��ġ�鼭 ���ڿ��� ����
					System.out.println(Join);
				}
			}

		}

	}

}

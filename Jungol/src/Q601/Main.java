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
			String back[] = Arrays.copyOf(cut, cut.length); // 배열 복사
			for (int j = 0; j < cut.length; j++) {
				if (j + 1 < cut.length) { // 마지막 인덱스제외를 한칸 옮김
					cut[j + 1] = back[j];
				} else if (j + 1 == cut.length) {
					cut[0] = back[cut.length - 1]; // 0번익덱스에 기존에 백업해둔 마지막 인덱스를 넣음
				}
				if (j == cut.length - 1) {
					String Join = String.join("", cut); // 배열을 ""(공백없이)로 합치면서 문자열로 변경
					System.out.println(Join);
				}
			}

		}

	}

}

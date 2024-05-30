package Q155;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = { 'J', 'U', 'N', 'G', 'O', 'L' };
		outer: while (sc.hasNext()) { // 다음에 입력받을 값이 있는가? 있으면 실행 없으면 멈춤
			String in = sc.next(); // 만약 위와같이 안하면 런타임에러 발생
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

//		outer: // 반복문 앞에 이름을 붙여준다
//		while (true) {
//			String in = sc.nextLine();
//			char in2 = in.charAt(0);
//			for (int i = 0; i < a.length; i++) {
//				if (a[i] == in2) {
//					System.out.print(a[i]);
//					continue outer;  //이렇게 하면 while 시작지점으로 이동함
//				} else if (i == a.length - 1 ) {
//					System.out.print("none");
//					break outer;
//				}
//			}
//		}
//
//	}
//}

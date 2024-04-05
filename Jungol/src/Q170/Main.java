package Q170;

public class Main {
	int a = 0;

	public static void Output1() {
		System.out.println("first");
		for (int i = 0; i < 10; i++) {
			System.out.print("@");
			if (i == 9) {
				System.out.print("\n");
			}
		}
	}

	public static void Output2() {
		System.out.println("second");
		for (int i = 0; i < 10; i++) {
			System.out.print("@");
			if (i == 9) {
				System.out.print("\n");
			}
		}
	}

	public static void Output3() {
		System.out.println("third");
		for (int i = 0; i < 10; i++) {
			System.out.print("@");
			if (i == 9) {
				System.out.print("\n");
			}
		}
	}

	public static void main(String[] args) {
		Output1();
		Output2();
		Output3();
	}
}
//같은함수를 3번호출해서 앞만 바뀌게 하는건 모르겠다.

/*
 * /출력 
 * first
 * @@@@@@@@@@ 
 * second
 * @@@@@@@@@@ 
 * third
 * @@@@@@@@@@
 */
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
//�����Լ��� 3��ȣ���ؼ� �ո� �ٲ�� �ϴ°� �𸣰ڴ�.

/*
 * /��� 
 * first
 * @@@@@@@@@@ 
 * second
 * @@@@@@@@@@ 
 * third
 * @@@@@@@@@@
 */
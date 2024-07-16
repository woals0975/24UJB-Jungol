package Q608;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		if(a.contains("c")==true) {
			System.out.print("Yes ");
		}else {
			System.out.print("No ");
		}
		if(a.contains("ab")==true) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}
}

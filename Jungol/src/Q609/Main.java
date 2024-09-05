package Q609;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		sc.close();
		String[] b = a.split(" ");
		Arrays.sort(b); //오름차순
		//Arrays.sort(b,Collections.reverseOrder()); 내림차순
		System.out.println(b[0]);
	}

}

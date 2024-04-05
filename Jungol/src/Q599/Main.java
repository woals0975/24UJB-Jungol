package Q599;

import java.util.Scanner;

public class Main {

	public static void change(String in) {
		char[] in2 = new char[in.length()];
		for (int i = 0; i < in.length(); i++) { 
			in2[i] = in.charAt(i);
			if (in2[i] >= 97 && in2[i] <= 122) { // 'a''z'
				System.out.print((char) (in2[i] - 32));
			} else if (in2[i] >= 65 && in2[i] <= 90) {// 'A' 'Z'
				System.out.print((char) (in2[i]));
			} else { 
			}
		}
	}
//str.split("[^a-zA-Z&]
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		sc.close();
		change(in);

	}
}
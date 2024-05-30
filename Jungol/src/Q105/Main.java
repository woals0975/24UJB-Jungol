package Q105;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] word = { "Seoul", "Pusan", "Incheon", "Daegu", "Gwangju" };
		String[] num = { "10312545", "3567910", "2758296", "2511676", "1454636" };
		String[] plus = { "+91375", "+5868", "+64888", "+17230", "+29774" };
		sc.close();
		for(int i=0; i<5;i++) {
		print(word[i], num[i], plus[i]);
		}

	}

	public static void print(String word, String num, String plus) {
		NumberFormat n = NumberFormat.getInstance();
		num=n.format(num);
		plus=n.format(plus);
		System.out.printf("%15s%15s%15s",word,num,plus);
	}

}
///??
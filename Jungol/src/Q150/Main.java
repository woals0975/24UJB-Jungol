package Q150;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();  //ºóÄ­ÀÖ¾î¼­ »ç¿ë
		sc.close();
		reverse(in);
	}

	
	public static void reverse(String in) { 
	char[] output = new char[in.length()];
		for(int i=0;i<in.length();i++) {
		char a = in.charAt(i);
		output[i] =a;
		}
		int i=0;
		for(int j=in.length()-1; j>=0;j--,i++) {
		char b = in.charAt(j);
		output[i] = b;
		if(j==0) {
		for(i=0;i<in.length();i++) {
			System.out.print(output[i]);
		}
		}
		
		
	}
}
}


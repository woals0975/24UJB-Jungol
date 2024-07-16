package Q592;

import java.util.Scanner;

public class Main {
	
	public static void sum(String[] a,int b, int c) {
		if(a.length>b) {
			int x = (int) Math.pow(Integer.parseInt(a[b]),2);	
			c+= x;
			b++;
			sum(a,b,c);
		}else {
			System.out.print(c);
		}
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		String b = a + "";
		String[] c = b.split("");
		sum(c,0,0); //배열,index,합
	}
}

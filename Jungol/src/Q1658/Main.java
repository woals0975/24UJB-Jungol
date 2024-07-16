package Q1658;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		ArrayList<Integer> num = new ArrayList<>();
		ArrayList<Integer> num2 = new ArrayList<>();
		for(int i=1;i<=a; i++) {
			if(a%i==0) {
				num.add(i);
			}
		}
		for(int i=1;i<=b; i++) {
			if(b%i==0) {
				num2.add(i);
			}
		}
		int[] snum = num.stream().mapToInt(Integer::intValue).toArray();
		int[] snum2 = num2.stream().mapToInt(Integer::intValue).toArray();
		out:
		for(int i=snum.length-1;i>=0;i--) {
			for(int j=snum2.length-1;j>=0;j--) {
				if(snum[i]==snum2[j]) {
					System.out.println(snum[i]);
					break out;
				}
			}
		}
		
		for(int i=1;i<=b;i++) {
			int x=a*i;
			if(x%a==0 && x%b==0) {
				System.out.println(x);
				break;
			}
		}
	}

}

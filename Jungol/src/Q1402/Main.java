package Q1402;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		ArrayList<Integer> num = new ArrayList<>();
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				num.add(i);
			}
		}
		Collections.sort(num);
		int[] num2 = num.stream().mapToInt(Integer::intValue).toArray();
		if(b<=num2.length) {
		System.out.print(num2[b-1]);
		}else {
			System.out.print(0);
		}
			
		
		
	}

}

package Q1304;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<=a; i++) {
			for(int j=0; j<a; j++) {
				list.add(i+j*a);
			}
		}
		int b[] = list.stream().mapToInt(Integer::intValue).toArray();
		
		//System.out.print(Arrays.toString(b));
		int c = 0;
		for(int i=1; i<=a; i++) {
			for(int j=0; j<a; j++,c++) {
				System.out.print(b[c]+" ");
				if(j==a-1) {
					System.out.println();
				}
			}
		}
		
	}
}

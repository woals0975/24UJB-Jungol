package Q1856;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		int m = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1;i<=a*b;i++) {
			list.add(i);
		}
		int[] arr = list.stream().mapToInt(Integer::intValue).toArray(); //리스트를 배열로 한번에 바꿔서 저장
		for(int i=0;i<a;i++) {
			m = 0;
			for(int j=0;j<b;j++,c++,m=m+2) {
			if(i%2==0) { //홀수행
				System.out.print(arr[c]+" ");
			}else { //짝수행
				System.out.print(arr[c+b-1-m]+" ");
			}
			if(j==b-1) {
				System.out.println();
			}
			
		}
		}
}
}

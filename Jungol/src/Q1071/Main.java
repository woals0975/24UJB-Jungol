package Q1071;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList<Integer> num = new ArrayList<>(); //입력된 정수값
		//ArrayList<Integer> num2 = new ArrayList<>();
		
		for(int i=0; i<a; i++) {
			int b = sc.nextInt();
			num.add(b);
		}
		int[] num2 = num.stream().mapToInt(Integer::intValue).toArray();
		int c =sc.nextInt(); //기준 수
		int c2 = 0; //약수합
		for(int i=0;i<num.size();i++) {
			if((c%num2[i])==0) {
				c2+=num2[i];  //약수 합
			}
			
		}
		int c3 = 0; //배수합
		for(int i=0;i<num.size();i++) {
			if(num2[i]%c==0) {
				c3+=num2[i];
			}
		}
		System.out.println(c2);
		System.out.println(c3);
		
	}

}

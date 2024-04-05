package Q9071;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int s = 0;
		int c = 0;
		
		for(int i=1; i<10; i++) {
			int w = sc.nextInt();//입력 정수
			if(i==0) {
				num[i]= w;  //num[0] = w;
			}
			
			if(w%2==0) {
				if(w>=num[i]) {
					num[i]= w;
					c = num[i];
				}
			}else if(w<num[i-1]){
				num[i] = w;
				s = num[i];
				
			}
			if(i==9) {
				sc.close();
				System.out.print(s+" ");
				System.out.print(c);
			
				
				
			}		
		}
	}
}
//        아오오오오오오오오오오오 개망
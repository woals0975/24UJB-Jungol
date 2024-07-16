package Q1309;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		int a = sc.nextInt();
		sc.close();
		long sum=1;
		for(int i=a; i>0;i--) {
			num.add(i);
			if(i>1) {
			System.out.printf("%d! = %d * %d! \n",i,i,i-1 );
			}else {
			System.out.printf("%d! = %d \n",i,i );
			}
		}
		int[] num2= num.stream().mapToInt(Integer::intValue).toArray(); // list 를 int 배열로 변환
		
		for(int i=0;i<num.size();i++) {
			sum=sum*num2[i];
		}
		
			System.out.print(sum);
		
	
	}

}

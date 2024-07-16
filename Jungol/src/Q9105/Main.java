package Q9105;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	
	public static void dice(int[] a, int b) {  //배열, index마지막(a-1) 
		System.out.println(Arrays.toString(a));
		int i=1;
		if(a[b]!=6) {
			a[b]++;
			dice(a,b);
		}else {
			a[b]=1;
			a[b-1]++;
			dice(a,b);
		if(a[b-1]==6) {
			a[b-1]=1;
			a[b-2]=
		}
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] b = new int[a];
		for(int i=0; i<b.length;i++) {
			b[i]=1;
		}
		dice(b,(a-1));
	}

}

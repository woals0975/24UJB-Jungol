package Q9070;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int[] a = new int[10];
		int b = 0;
		for(int i =0; i<10; i++ ) {
		int input = sc.nextInt();
		a[i]=input; 
		if(i==0) {
		a[i]=input;
		b =a[i]; 
		
		}else if(a[i]>b) {
			b=a[i];
		}else if(i==9) {
			System.out.print(b);
			sc.close();
		}
		
		}
		
	

	}
}


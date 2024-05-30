package Q139;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		if(a>b) {
		for(int j=1;j<=9;j++){
			for(int i=a;i>=b;i--) {
				System.out.printf("%d * %d = %2d   ",i,j,i*j);
				if(i==b) {
					System.out.println();
				}
			}
		}
	}else {
		for(int j=1;j<=9;j++){
				for(int i=a;i<=b;i++) {
					System.out.printf("%d * %d = %2d   ",i,j,i*j);
					if(i==b) {
						System.out.println();
	}

}
}
	}
	}
}


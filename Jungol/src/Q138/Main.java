package Q138;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Input = sc.nextInt();
		for(int i=1;i<=Input;i++) {
			for(int j=1;j<=Input;j++) {
				System.out.printf("(%d, %d) ",i,j);
				if(j==Input) {
					System.out.println();
				}
				
				
			}
		}
	}

}

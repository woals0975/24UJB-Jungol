package Q174;

import java.util.Scanner;

public class Main {
	public static void Score(int[] K,int[] M,int[] E) {
		for(int i=0; i<3;i++) {
		System.out.print(K[i]+" "+M[i]+" "+E[i]+" "+(K[i]+M[i]+E[i])+ "\n");
		if(i==2) {
			int sumK=0, sumM=0, sumE=0;
			for(int j=0; j<3;j++) {
			sumK+=K[i];
			sumM+=M[i];
			sumE+=E[i];
			System.out.print(sumK+" "+sumM+" "+sumE+" "+(sumK+sumM+sumE));
			}
		}
		}
	
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] K  = new int[3];
		int[] M  = {96,88,66};
		int[] E  = {50,80,100};
	}

}
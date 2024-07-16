package Q2809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		ArrayList<Integer> num = new ArrayList<>();
		for(int i=1; i<=a;i++) {
			if(a%i==0) {
				num.add(i);
			}
		}
		int[] b = num.stream().mapToInt(Integer::intValue).toArray();

		for(int i=0; i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}

}
//시간 초과
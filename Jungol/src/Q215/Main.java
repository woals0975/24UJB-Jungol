package Q215;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a = sc.next();
	String b = sc.next();
	sc.close();
	ArrayList<Integer> a1 = new ArrayList<Integer>();  //리스트에 넣기
	ArrayList<Integer> b1 = new ArrayList<Integer>();
	
	for(int i=0; i<a.length();i++) {
		char check = a.charAt(i);
		int add = Character.getNumericValue(check);  //각각이 숫자인지 확인
		
		if(check>=48 && check<=57) {
			a1.add(add);
		}else {
			break;
		}
	}
	
	for(int i=0; i<b.length();i++) {
		char check = b.charAt(i);
		int add = Character.getNumericValue(check);
		
		if(check>=48 && check<=57) {
			b1.add(add);
		}else {
			break;
		}
	}
	Object[] a2 = a1.toArray();  //오브젝트에 넣어서 배열로 바꿈
	Object[] b2 = b1.toArray();
	int x = 0; 
	int y = 0;
	int j = a2.length-1;
	int k = b2.length-1;
	for(int i=0;i<a2.length;i++) {
		x = (int) (x+(Integer)a2[i]*Math.pow(10, j));   //각값에 맞는 10의 제곱을 곱해서 합해 값을 만듬
		j--;
	}
	for(int i=0;i<b2.length;i++) {
		y = (int) (y+(Integer)b2[i]*Math.pow(10, k));
		k--;
	}
	System.out.print(x*y);
	
	}
}

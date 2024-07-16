package Q1002;


import java.util.Scanner;

public class Main {
							
	public static int ea(int a, int b, int x) {
		int c;
			while(b!=0) {
				
				c=a%b;
				a=b;
				b=c;
			}
			x=a;
			return x; // 최대공약수;
		}
	
	

	
	
							
	public static int lcm(int a, int b, int y) {  //최소 공배수
		if(a>=b) {
		for(int i=1;i<b;i++) {
			int c = (a*i)%b;
			int d = (a*i)/b;
			if(c==0) {
				y = a*i;
			}
		}
		}else {
			for(int i=1;i<b;i++) {
				int c = (b*i)%a;
				int d = (b*i)/a;
			if(c==0) {
					y = b*i;
				}
			}
		}
		return y;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int[] arr = new int[a];
		for(int i=0;i<a; i++) {
			int b = sc.nextInt();
			arr[i]= b;
		}
		sc.close();
		int ea = 0;
		int lcm = 0;
		int f = arr[0];
		int l = arr[1];
		int f2 = arr[0];
		int l2 = arr[1];
		
		for(int i=1; i<=arr.length;i++) {
			if(i<arr.length){
				if(i==1) {
				f = arr[i-1];
				l= arr[i];
				ea =ea(f,l,ea); //첫 최대공약수
				lcm = lcm(f,l,lcm); //첫 최소공배수
				f=ea; //최대 공약수
				f2=lcm;//최소공배수
				}else {	
				l= arr[i];
				lcm = lcm(f2,l,lcm);
				f2=lcm;
				ea =ea(f,l,ea);
				f=ea;
				}
			}
			
		}
		System.out.print(ea +" " + lcm );

}
}

//30 18
//540 = 6 * 90
//유클리드 호제법 두 수(A,B)의 최대공약수는 A를 B로 나눈 값을 r이라고할때
//  (A,B) = (B,r) 을 반복해서 나머지가 0이되면 그 수가 최대공약수이다
//ex)(30,18) (18.12) (12,6) 최대 공약수 6
//두 값을 곱한값은 최대공약수*최소공배수이다.
//따라서 30*18=540 540/6 =90 최대공약수= 6 최소공배수=90
